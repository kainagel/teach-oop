package kk_xml.cc_saxExample.zz_archive;
import java.io.*;
import java.util.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;
import javax.xml.parsers.*;

class MyPlansParser extends org.xml.sax.helpers.DefaultHandler
{
    // ##################################################################

    public void startElement(String namespaceURI,
                             String sName, // simple name (localName)
                             String qName, // qualified name
                             Attributes attrs)
    {
	if ( qName == "person" ) {
	    System.out.println ( " encountering a person; need to allocate mem " ) ;
// 	    Person person = new Person() ;
	}
    }
}
