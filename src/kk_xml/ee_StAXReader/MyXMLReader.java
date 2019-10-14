package kk_xml.ee_StAXReader;

import java.io.*;

import javax.xml.*;
import javax.xml.stream.*;
import javax.xml.stream.events.*;
import javax.xml.transform.stax.*;
import javax.xml.validation.*;

import org.xml.sax.*;

public class MyXMLReader {

	private static int indent = 0 ;
	
	public static void main( String[] args ) {

		File file = new File("src/kk_xml/ee_StAXReader/plans.xml");
		try ( FileInputStream stream = new FileInputStream(file) ; ) {
			XMLInputFactory factory = XMLInputFactory.newInstance() ;
			//			factory.setProperty(XMLInputFactory.SUPPORT_DTD, true ) ;
//			factory.setProperty(XMLInputFactory.IS_VALIDATING, true);
			XMLStreamReader in = factory.createXMLStreamReader( stream );

			// stream of events:
			while (in.hasNext()) {
				int eventTypeAsInt = in.next();
				System.out.println( " eventType: " + eventTypeAsInt ) ;
				printEventType(eventTypeAsInt) ;
			}
				
//			while ( in.hasNext() ) {
//				in.next() ; // advance one step; we don't need the result
//
//				if ( in.isStartElement() ) {
//					printAndIncrementIndent() ;
//					String elementName = in.getLocalName();
//					System.out.print( elementName + ": ") ; 
////					for ( int ii=0 ; ii<in.getAttributeCount() ; ii++ ) {
////						String key = in.getAttributeLocalName(ii) ;
////						String value = in.getAttributeValue(ii) ;
////						System.out.print( key + "=" + value + " " ) ;
////					}
//					//text aus dem element rausholen ist einfacher als via isCharacters()
//					if ("route".equalsIgnoreCase(in.getLocalName())) {
//						System.out.print(in.getElementText());
//						indent-- ; // (swallows route end element)
//					}
//					System.out.println() ;
//				} else if ( in.isEndElement() ) {
//					decrementAndPrintIndent() ;
//					System.out.println( "end of: " + in.getLocalName() ) ;
////				} else if ( in.isCharacters() ) {
////										System.out.print( in.getText() ) ;
////					// text is a bit messy to parse; I would avoid it as long as the document is not
////					// a true text document.
//				}
//			}

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
		SchemaFactory sfactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Schema schema;
		try {
			schema = sfactory.newSchema(new File("src/kk_xml/ee_StAXReader/plans.dtd"));
			System.err.println("will only work with xsd") ;
			System.exit(-1);

			Validator validator = schema.newValidator();
			validator.validate(new StAXSource(in));

			//no exception thrown, so valid
			System.out.println("Document is valid");
		} catch (SAXException e) {
			System.err.println(in.getLocation()) ;
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
