package kk_xml.ff_StAXWriter;

import java.io.*;

import javax.xml.stream.*;

public class MyXMLWriter {

	public static void main( String[] args ) { 
		XMLOutputFactory factory =  XMLOutputFactory.newInstance();
		try {
			String filename = "src/kk_xml/ff_StAXWriter/test.xml" ;
			XMLStreamWriter out = factory.createXMLStreamWriter(new FileWriter(filename));
//			XMLStreamWriter out = new IndentingXMLStreamWriter(tmp);
			out.writeStartDocument("utf-8","1.0");
			
			out.writeStartElement("buildings") ;

//			writeBuildingsWithAttributes(out);
			
			writeBuildingsWithElements(out) ;
			
			out.writeEndElement() ;

			out.writeEndDocument();

			out.flush();
			out.close();
		} catch (XMLStreamException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("done; look in package directory for output ...") ;
	
	}

	private static void writeBuildingsWithAttributes(XMLStreamWriter out)
	throws XMLStreamException {
		out.writeStartElement("building") ;
		out.writeAttribute("streetAddress", "Salzufer 17") ;
		out.writeEndElement() ;

		out.writeStartElement("building") ;
		out.writeAttribute("streetAddress", "Str. d. 17. Juni") ;
		out.writeEndElement() ;
	}

	private static void writeBuildingsWithElements(XMLStreamWriter out)
	throws XMLStreamException {
		out.writeStartElement("building") ; {
			out.writeStartElement("streetAddress"); {
				out.writeCharacters("Salzufer 17") ;
			}
			out.writeEndElement() ;
		}
		out.writeEndElement() ;

		out.writeStartElement("building") ;
		out.writeStartElement("streetAddress") ;
		out.writeCharacters("Str. d. 17. Juni") ;
		out.writeEndElement() ;
		out.writeEndElement() ;
	}

	
}
