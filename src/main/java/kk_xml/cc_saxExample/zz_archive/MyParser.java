package kk_xml.cc_saxExample.zz_archive;
import org.xml.sax.*;
import java.util.*;
import org.xml.sax.helpers.*;

class MyParser extends org.xml.sax.helpers.DefaultHandler
{
    Locator locator_ ;

    int indentLevel_ = 0 ;
    String indentString = "    " ;

    boolean iAmInRoute_ = false ;

    // ##################################################################
    // ##################################################################

    public void startDocument() 
    {
	emitln ( "\nencountered startDocument\n" ) ;
    }

    // ##################################################################
    // ##################################################################

    public void endDocument()    
    {
	emitln ( "\nencountered endDocument\n" ) ;
    }

    // ##################################################################
    // ##################################################################

    public void startElement(String namespaceURI,
                             String sName, // simple name (localName)
                             String qName, // qualified name
                             Attributes attrs)
    {
 	emitln ( "ELEMENT: " + qName ) ;
	
// 	System.out.println ( "attrs: " + attrs ) ;
	
//   	emitln ( " attrs: " + attrs ) ;

 	emitln ( " line number: " + locator_.getLineNumber() ) ;

	for (int i = 0; i < attrs.getLength(); i++) {
	    String aName = attrs.getQName(i);
	    emitln ( " attrib: " + aName + " = " + attrs.getValue(i) ) ;
	}
 	indentLevel_ ++ ;

	if ( qName.equals("route") ) {
	    System.out.println ( "I am in route") ;
	    iAmInRoute_ = true ;
	}

    }

    // ##################################################################
    // ##################################################################

    public void endElement(String namespaceURI,
                           String sName, // simple name
                           String qName  // qualified name
                          )
    {
	indentLevel_ -- ;
	emitln ( "END_ELEMENT ( " + qName + " )" ) ;
	if ( qName.equals("route") ) {
	    System.out.println ( "I have left route") ;
	    iAmInRoute_ = false ;
	}
    }

    // ##################################################################
    // ##################################################################

    public void characters(char buf[], int offset, int len)
    {
	if ( iAmInRoute_ ) {

	    String s = new String(buf, offset, len);
//  	System.out.println ( "|"+s+"|" ) ;
	    List tokens = Arrays.asList ( s.split( " " ) ) ;
// // 	if ( tokens.size() > 0 ) {
// 	    emitln ( "TOKENS (one per line): " ) ;
// // 	}
	    for ( Iterator it = tokens.iterator() ; it.hasNext() ; )
	    {
		String token = (String) it.next() ;
		emitln ( token ) ;
	    }
	}
    }

    // ##################################################################
    // ##################################################################

    // The following method is a bit weird.  The ``set'' is from the perspective of the parser.

    public void setDocumentLocator ( Locator ll ) {
	locator_ = ll ;
	emitln ( "LOCATOR:" ) ;
	emitln ( " PublicId: " + ll.getPublicId() ) ;
	emitln ( " SystemId: " + ll.getSystemId() ) ;
    }

    // ##################################################################
//     // ##################################################################
// 
//     public void processingInstruction(String target, String data)
//     {
// 	emitln ( "INSTRUCTIONS:" ) ;
// 	emitln ( " target: " + target ) ;
// 	emitln ( " data: " + data ) ;
//     }
// 
//     // ##################################################################
//     // ##################################################################
// 
//     // handling of non-fatal errors:
//     public void error(SAXParseException e)
//     {
// // 	throw e;
// 	System.err.println("** Non-fatal error"
// 			   + ", line " + e.getLineNumber()
// 			   + ", uri " + e.getSystemId());
// 	System.err.println( "   " + e ) ;
//     }    
// 
//     // ##################################################################
//     // ##################################################################
// 
//     public void warning(SAXParseException err)
//     {
// 	System.err.println("** Warning"
// 			   + ", line " + err.getLineNumber()
// 			   + ", uri " + err.getSystemId());
// 	System.err.println("   " + err );
//     }
// 
// 
//     // ##################################################################
    // ##################################################################

    private void emitln ( String s ) 
    {
	for ( int ii=0; ii<indentLevel_ ; ii++ ) 
	{
	    System.out.print ( indentString ) ;
	}
	System.out.println ( s ) ;
    }

    // ##################################################################
    // ##################################################################

}
