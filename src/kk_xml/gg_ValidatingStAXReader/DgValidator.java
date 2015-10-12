/**
 * 
 */
package kk_xml.gg_ValidatingStAXReader;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

/**
 * @author dgrether
 *
 */
public class DgValidator extends DefaultHandler {

	
	
	private File schemaSource;
	private String source;

	public DgValidator(String schema) {
		this.schemaSource = new File(schema);
	}

	@Override
	public InputSource resolveEntity(final String publicId, final String systemId) {
		return new InputSource(this.schemaSource.getAbsolutePath());
	}
	
	/* implement ErrorHandler */

	@Override
	public void error(final SAXParseException ex) throws SAXException {
//		if (this.context.isEmpty()) {
//			System.err.println("Missing DOCTYPE.");
//		}
		System.err.println("XML-ERROR: " + getInputSource(ex) + ", line " + ex.getLineNumber() + ", column " + ex.getColumnNumber() + ":");
		System.err.println(ex.toString());
		throw ex;
	}

	@Override
	public void fatalError(final SAXParseException ex) throws SAXException {
		System.err.println("XML-FATAL: " + getInputSource(ex) + ", line " + ex.getLineNumber() + ", column " + ex.getColumnNumber() + ":");
		System.err.println(ex.toString());
		throw ex;
	}

	@Override
	public void warning(final SAXParseException ex) throws SAXException {
		System.err.println("XML-WARNING: " + getInputSource(ex) + ", line " + ex.getLineNumber() + ", column " + ex.getColumnNumber() + ":");
		System.err.println(ex.getMessage());
	}
	
	private String getInputSource(final SAXParseException ex) {
		System.out.println(ex.getPublicId());
		System.out.println(ex.getSystemId());
		System.out.println(ex.getCause());
		System.out.println(ex.getLocalizedMessage());
		System.out.println(ex.getMessage());
		if (ex.getSystemId() != null) {
			return ex.getSystemId();
		}
		else if (ex.getPublicId() != null) {
			return ex.getPublicId();
		}
		//try to use the locally stored inputSource
		return this.source;
	}
	
	public void validateFile(String filename) throws Exception {
		this.source = filename;
		SAXParserFactory factory = SAXParserFactory.newInstance();
		factory.setValidating(true);
		SAXParser parser = factory.newSAXParser();
		XMLReader reader = parser.getXMLReader();
		reader.setContentHandler(this);
		reader.setErrorHandler(this);
		reader.setEntityResolver(this);
		reader.parse(filename);
	}
	
	public static void main(String[] args) throws Exception {
		String file = "src/kk_xml/gg_ValidatingStAXReader/plans.xml";
		String schema = "src/kk_xml/gg_ValidatingStAXReader/plans.dtd";
		new DgValidator(schema).validateFile(file);
	}
	
}
