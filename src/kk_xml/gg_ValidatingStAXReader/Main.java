package kk_xml.gg_ValidatingStAXReader;

import java.io.*;

import javax.xml.*;
import javax.xml.stream.*;
import javax.xml.transform.stax.*;
import javax.xml.validation.*;

import org.xml.sax.*;

/**
 * based on http://stackoverflow.com/a/13427581 .
 * 
 * @author nagel
 *
 */
public class Main {

	public static void main( String[] args ) {
		
		XMLStreamReader in = null ;

		try {
			
			File file = new File("src/kk_xml/gg_ValidatingStAXReader/plans.xml");
			FileInputStream stream = new FileInputStream(file) ;

			XMLInputFactory factory = XMLInputFactory.newInstance() ;

			in = factory.createXMLStreamReader( stream );
			
			// wrapping ``in'' into ``MyXMLReader'' so we can parse while validating:
			in = new MyXMLReader( in ) ;
			
			// generating a validator:
			SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			Schema schema = schemaFactory.newSchema(new File("src/kk_xml/gg_ValidatingStAXReader/plans.dtd"));
			Validator validator = schema.newValidator();
			
			// wrapping ``in'' into the validator and validate (while reading):
			 validator.validate(new StAXSource(in));
		
		} catch (XMLStreamException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			System.err.println( in.getLocation() ) ;
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}

}
