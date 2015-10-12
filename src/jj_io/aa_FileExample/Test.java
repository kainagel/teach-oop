package jj_io.aa_FileExample;
import java.io.*;
import java.util.zip.*;

class Test
{

	public static void main ( String[] args ) throws IOException
	{

		File inputFile = new File ( "./src/jj_io/aa_FileExample/farrago.txt" ) ;
		File outputFile = new File ( "./src/jj_io/aa_FileExample/out.txt" ) ;
//		File outputFileGz = new File ( "./src/jj_io/aa_FileExample/out.txt.gz" ) ;

		FileReader in = new FileReader ( inputFile ) ;
		FileWriter out = new FileWriter ( outputFile ) ;

//		FileReader inp = new FileReader ( inputFile ) ;
//		BufferedReader in = new BufferedReader(inp) ;
//		FileWriter outp = new FileWriter ( outputFile ) ;
//		BufferedWriter out= new BufferedWriter(outp) ;
		
		// NOTE: "stream" just means that it is always 8bit

//		FileInputStream in = new FileInputStream ( inputFile ) ;
//		FileOutputStream out = new FileOutputStream ( outputFile ) ;

//		FileInputStream inp = new FileInputStream ( inputFile ) ;
//		FileOutputStream outp = new FileOutputStream ( outputFile ) ;
//		BufferedInputStream in = new BufferedInputStream( inp ) ;
//		BufferedOutputStream out = new BufferedOutputStream ( outp ) ;


//		FileInputStream inp = new FileInputStream ( inputFile ) ;
//		BufferedInputStream in = new BufferedInputStream( inp ) ;

//		FileOutputStream outp = new FileOutputStream ( outputFileGz ) ;
//		BufferedOutputStream outb = new BufferedOutputStream ( outp ) ;
//		GZIPOutputStream out = new GZIPOutputStream ( outb ) ;

		int c ;
		while ( (c=in.read()) != -1 ) {
			out.write(c) ;
		}

		in.close() ;
		out.close() ;
		
		System.out.println("done") ;

	}

}

