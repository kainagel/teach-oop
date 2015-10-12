package kk_xml.gg_ValidatingStAXReader;

import java.io.*;

import javax.xml.stream.*;
import javax.xml.stream.events.*;
import javax.xml.stream.util.*;

public class MyXMLReader extends StreamReaderDelegate {

	int indent = 0 ;

	public MyXMLReader(XMLStreamReader in) {
		super(in) ;
	}
	
	@Override
	public int next() throws XMLStreamException {
		int n = super.next();
		
		if ( this.isStartElement() ) {
			indent = printAndIncrementIndent(indent) ;
			String text = this.getLocalName();
			System.out.print( text + ": ") ; 
			for ( int ii=0 ; ii<this.getAttributeCount() ; ii++ ) {
				String name = this.getAttributeLocalName(ii) ;
				String value = this.getAttributeValue(ii) ;
				System.out.print( name + "=" + value + " " ) ;
			}
			System.out.println() ;
		} else if ( this.isEndElement() ) {
			indent = decrementAndPrintIndent(indent) ;
			System.out.println( "end of: " + this.getLocalName() ) ;
		} 

		return n ;
	}

	
	private static int printAndIncrementIndent(int indent) {
		for ( int ii=0 ; ii<indent ; ii++ ) {
			System.out.print("   ") ;
		}
		indent++ ;
		return indent ;
	}
	private static int decrementAndPrintIndent(int indent) {
		indent-- ;
		for ( int ii=0 ; ii<indent ; ii++ ) {
			System.out.print("   ") ;
		}
		return indent ;
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
  
}
