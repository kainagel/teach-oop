package kk_xml.cc_saxExample;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXParseException;

class MyHandler extends org.xml.sax.helpers.DefaultHandler
{
//	Locator locator_ ;
//
	int indentLevel_ = 0 ;
	String indentString = "    " ;

	boolean iAmInRoute_ = false ;

	// ##################################################################
	// ##################################################################

//	@Override
//	public void startDocument() 
//	{
//		emitln ( "\nencountered startDocument\n" ) ;
//	}

	// ##################################################################
	// ##################################################################

//	@Override
//	public void endDocument()    
//	{
//		emitln ( "\nencountered endDocument\n" ) ;
//	}

	// ##################################################################
//	// ##################################################################
//
//	@Override
//	public void startElement(String namespaceURI,
//			String sName, // simple name (localName)
//			String qName, // qualified name
//			Attributes attrs)
//	{
//	
////     	System.out.println( "ELEMENT: " + qName ) ;
//	
//		emitln ( "ELEMENT: " + qName ) ;
//
////		emitln ( " attrs: " + attrs ) ;
//
////		emitln ( " line number: " + locator_.getLineNumber() ) ;
//
//		for (int i = 0; i < attrs.getLength(); i++) {
//			emitln ( " attrib: " + attrs.getQName(i) + " = " + attrs.getValue(i) ) ;
//		}
//		indentLevel_ ++ ;
//
//		if ( qName.equals("route") ) {
//			iAmInRoute_ = true ;
//		}
//
//	}
//
//	// ##################################################################
//	// ##################################################################
//
//	@Override
//	public void endElement(String namespaceURI,
//			String sName, // simple name
//			String qName  // qualified name
//	)
//	{
//		indentLevel_ -- ;
//		emitln ( "END_ELEMENT ( " + qName + " )" ) ;
//		if ( qName.equals("route") ) {
//			iAmInRoute_ = false ;
//		}
//	}
//
//	// ##################################################################
//	// ##################################################################
//
//	@Override
//	public void characters(char buf[], int offset, int len)
//	{
//		if ( iAmInRoute_ ) 
//		{
//			String s = new String(buf, offset, len);
////			System.out.println ( "|"+s+"|" ) ;
//			List tokens = Arrays.asList ( s.split( " " ) ) ;
//			// // 	if ( tokens.size() > 0 ) {
//			// 	    emitln ( "TOKENS (one per line): " ) ;
//			// // 	}
//			for ( Iterator it = tokens.iterator() ; it.hasNext() ; )
//			{
//				String token = (String) it.next() ;
//				emitln ( token ) ;
//			}
//		}
//	}
//
//	// ##################################################################
	// ##################################################################

//	// The following method is a bit weird.  The ``set'' is from the perspective of the parser.

//	public void setDocumentLocator ( Locator ll ) {
//	locator_ = ll ;
//	emitln ( "LOCATOR:" ) ;
//	emitln ( " PublicId: " + ll.getPublicId() ) ;
//	emitln ( " SystemId: " + ll.getSystemId() ) ;
//	}

//	// ##################################################################
//	// ##################################################################

//	public void processingInstruction(String target, String data)
//	{
//	emitln ( "INSTRUCTIONS:" ) ;
//	emitln ( " target: " + target ) ;
//	emitln ( " data: " + data ) ;
//	}

//	// ##################################################################
	// ##################################################################

	// handling of non-fatal errors:
	@Override
	public void error(SAXParseException e)
	{
//		throw e;
		System.err.println("** Non-fatal error"
				+ ", line " + e.getLineNumber()
				+ ", uri " + e.getSystemId());
		System.err.println( "   " + e ) ;
//		System.exit(-1) ;
	}    

	// ##################################################################
	// ##################################################################

	@Override
	public void warning(SAXParseException err )
	{
		System.err.println("** Warning"
				+ ", line " + err.getLineNumber()
				+ ", uri " + err.getSystemId());
		System.err.println("   " + err );
	}


	// ##################################################################
//	// ##################################################################
//
//	private void emitln ( String s ) 
//	{
//		for ( int ii=0; ii<indentLevel_ ; ii++ ) 
//		{
//			System.out.print ( indentString ) ;
//		}
//		System.out.println ( s ) ;
//	}
//
//	// ##################################################################
	// ##################################################################

}
