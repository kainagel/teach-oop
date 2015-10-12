package kk_xml.cc_saxExample;
import java.io.*;
import javax.xml.parsers.*;

class SaxExample
{
	public static void main ( String[] args ) 
	{
		try 
		{
			// prepare input:
			SAXParserFactory factory = SAXParserFactory.newInstance();
			factory.setValidating(true) ;
			SAXParser saxParser = factory.newSAXParser();

			// parse:
			saxParser.parse( new File( "./src/kk_xml/cc_saxExample/plans.xml" ), 
					new MyHandler() );
		} 
		catch ( Exception e ) 
		{
			System.out.println ( e ) ;
		}

		System.out.println ( " I am done ") ;

	}
}

//Local Variables:
//fill-column: 90
//c-basic-offset: 4
//indent-tabs-mode: f
//End: 
