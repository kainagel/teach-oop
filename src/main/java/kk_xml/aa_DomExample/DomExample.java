package kk_xml.aa_DomExample;
//generell fuer file IO:
import java.io.*; 

//fuer DOM xml input:
import javax.xml.parsers.*; 
import org.w3c.dom.*;

//fuer DOM xml output:
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;



class DomExample 
{
	public static void main(String[] args)
	{
		Document document = null ;
		try 
		{
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			document = builder.parse( new File("./src/kk_xml/aa_DomExample/slideSample01.xml") );
//			document = builder.parse( new File("./src/kk_xml/aa_DomExample/ch.xml") );
//			document = builder.parse( new File("./src/kk_xml/aa_DomExample/m_2004031023-INVENT.xml") ) ;
		} 
		catch ( Exception e )
		{
			System.out.println ( e ) ;
		}

		// ############################################
		// ############################################

//		System.out.println ( "\n### get the root element\n" ) ;

		Element rootElement = document.getDocumentElement() ;
		
//		System.out.println ( " root Element: " + rootElement ) ;

//		System.out.println ( " root element attribute: " + rootElement.getAttribute("titlee") ) ;
		
//		NamedNodeMap attributes = rootElement.getAttributes() ; 
//		for ( int ii=0 ; ii<attributes.getLength() ; ii++ ) {
//			Node attr = attributes.item(ii) ;
//			System.out.println( " attr: " + attr ) ;
//		}
		

		// ############################################
//		// ############################################
//
//		System.out.println ( "### will now go through all relevant children" ) ;
//
//		NodeList children = rootElement.getChildNodes() ;
//
//		for ( int ii=0; ii<children.getLength() ; ii++ ) {
//			Node nn = children.item(ii) ;
//			if ( nn.getNodeType() == Node.ELEMENT_NODE ) {
//				System.out.println ( "next child; type: " + nn.getNodeType() ) ;
//				System.out.println ( " name: " + nn.getNodeName() ) ;
//				System.out.println ( nn ) ;
//			}
//		}
//
//		System.out.println ( "### finished going through all relevant children" ) ;
//
//		// ############################################
//		// ############################################
//
//		System.out.println ( "### another way of going through the children" ) ;
//		Node nn = rootElement.getFirstChild() ;
//		do { 
//			if ( nn.getNodeType() == Node.ELEMENT_NODE ) {
//				System.out.println ( nn ) ;
//			}
//			nn = nn.getNextSibling() ;
//		} while ( nn != null ) ;
//		System.out.println ( "### finished going through all relevant children\n" ) ;
//
//		// ############################################
//		// ############################################
//		
//		// retrieve some "valid" node/element to do something with it:
//		Node aNode = rootElement.getFirstChild() ;
//		while ( aNode.getNodeType() != Node.ELEMENT_NODE ) {
//			aNode = aNode.getNextSibling() ;
//		}
//		
//		// cast to "Element" functionality:
//		Element anElement = (Element) aNode ;
//
//		// add/remove some attributes:
//		anElement.setAttribute( "test", "tag" ) ;
//		anElement.setAttribute( "newtest", "verynewtag" ) ;
//		anElement.removeAttribute("type") ;

//		// ############################################
//		// ############################################
//		System.out.println ( "### add elements ..." );
//
		Node tmpNode = rootElement.getFirstChild() ;
		tmpNode = tmpNode.getNextSibling();
		tmpNode = tmpNode.getNextSibling();
		tmpNode = tmpNode.getNextSibling();

		Element newElement = document.createElement ( "mytest" ) ;
		newElement.setAttribute( "mtkey", "myvalue" ) ;
		rootElement.insertBefore ( newElement, tmpNode ) ;
//
//		System.out.println ( "### finished adding elements." );
//		// ############################################
//		// ############################################

//		System.out.println ( rootElement ) ;

//		// ############################################
//		// ############################################
//
		try {
			// Use a Transformer for output
			TransformerFactory tFactory = TransformerFactory.newInstance();
			Transformer transformer = tFactory.newTransformer();

			// 	    File outputFile = new File( "out.xml" ) ;
			// 	    FileWriter fileOut = new FileWriter( outputFile ) ;

			DOMSource source = new DOMSource(document);
			StreamResult result = new StreamResult(System.out);
			//  	    StreamResult resultTwo = new StreamResult(fileOut);

			transformer.transform(source, result);
			// 	    transformer.transform(source, resultTwo);
		} catch ( Exception e ) {
			System.out.println ( e ) ;
		}
//
//		// ############################################
		// ############################################


	} // main

}
