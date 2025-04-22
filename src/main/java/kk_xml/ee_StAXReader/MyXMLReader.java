package kk_xml.ee_StAXReader;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.XMLEvent;
import javax.xml.transform.stax.StAXSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyXMLReader {

	private static int indent = 0 ;
	
	public static void main( String[] args ) {

		File file = new File("src/main/java/kk_xml/ee_StAXReader/plans.xml");

		try ( FileInputStream stream = new FileInputStream(file) ; ) {





			XMLInputFactory factory = XMLInputFactory.newInstance() ;

//			factory.setProperty(XMLInputFactory.IS_VALIDATING, true); // does not work with java standard XMLInputFactory.
			// the java default implementation of this does not allow validation.  The woodstox implementation does but needs a dependency ...
			// thus see teach-oop-with maven.

			XMLStreamReader in = factory.createXMLStreamReader( stream );

//			// stream of events:
//			while (in.hasNext()) {
//				int result = in.next();
////				System.out.println( " eventType: " + result ) ;
//				printEventType(result) ;
//			}

			while ( in.hasNext() ) {
				in.next() ; // advance one step; we don't need the result

				if ( in.isStartElement() ) {
					printAndIncrementIndent() ;
					String elementName = in.getLocalName();
					System.out.print( elementName + ": ") ;

					for ( int ii=0 ; ii<in.getAttributeCount() ; ii++ ) {
						String key = in.getAttributeLocalName(ii) ;
						String value = in.getAttributeValue(ii) ;
						System.out.print( key + "=" + value + " " ) ;
					}
//					// text aus dem element rausholen ist einfacher als via isCharacters()
					if ("route".equalsIgnoreCase(in.getLocalName())) {
						System.out.print(in.getElementText());
						indent-- ; // (swallows route end element)
					}
					System.out.println() ;
				} else if ( in.isEndElement() ) {
					decrementAndPrintIndent() ;
					System.out.println( "end of: " + in.getLocalName() ) ;
//				} else if ( in.isCharacters() ) {
//					System.out.print( in.getText() ) ;
////					// text is a bit messy to parse; I would avoid it as long as the document is not
////					// a true text document.
				}
			}

		} catch (Exception e) {
			throw new RuntimeException(e) ;
		}

	}


	private static void printAndIncrementIndent() {
		for ( int ii=0 ; ii<indent ; ii++ ) {
			System.out.print("   ") ;
		}
		indent++ ;
	}
	private static void decrementAndPrintIndent() {
		indent-- ;
		for ( int ii=0 ; ii<indent ; ii++ ) {
			System.out.print("   ") ;
		}
	}

	/**
	 * Returns the String representation of the given integer constant.
	 *
	 * @param eventType Type of event.
	 * @return String representation of the event
	 */    
	private final static String getEventTypeString(int eventType) {
		switch (eventType){
		case XMLEvent.START_ELEMENT:
			return "START_ELEMENT";
		case XMLEvent.END_ELEMENT:
			return "END_ELEMENT";
		case XMLEvent.PROCESSING_INSTRUCTION:
			return "PROCESSING_INSTRUCTION";
		case XMLEvent.CHARACTERS:
			return "CHARACTERS";
		case XMLEvent.COMMENT:
			return "COMMENT";
		case XMLEvent.START_DOCUMENT:
			return "START_DOCUMENT";
		case XMLEvent.END_DOCUMENT:
			return "END_DOCUMENT";
		case XMLEvent.ENTITY_REFERENCE:
			return "ENTITY_REFERENCE";
		case XMLEvent.ATTRIBUTE:
			return "ATTRIBUTE";
		case XMLEvent.DTD:
			return "DTD";
		case XMLEvent.CDATA:
			return "CDATA";
		case XMLEvent.SPACE:
			return "SPACE";
		}
		return "UNKNOWN_EVENT_TYPE , " + eventType;
	}

	private static void printEventType(int eventType) {        
		System.out.println("EVENT TYPE("+eventType+") = " + getEventTypeString(eventType));
	}

	private static void validate(XMLStreamReader in) {
//		SchemaFactory sfactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		SchemaFactory sfactory = SchemaFactory.newInstance(XMLConstants.XML_DTD_NS_URI);
		try {
			Schema schema = sfactory.newSchema( new File( "src/main/java/kk_xml/ee_StAXReader/plans.dtd" ) );
			System.err.println("will only work with xsd") ;
			System.exit(-1);

			Validator validator = schema.newValidator();
			validator.validate(new StAXSource(in));

			//no exception thrown, so valid
			System.out.println("Document is valid");
		} catch (SAXException e) {
			System.err.println(in.getLocation()) ;
			e.printStackTrace();
			throw new RuntimeException(  ) ;
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(  ) ;
		}
	}


}
