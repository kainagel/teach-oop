package jj_io.aa_FileExample;
import java.io.*;
import java.util.zip.*;

class Test
{

	public static void main ( String[] args ) throws IOException 
	{


		//		File outputFileGz = new File ( "./src/jj_io/aa_FileExample/out.txt.gz" ) ;

		try (
				FileReader in = new FileReader ( new File ( "./src/jj_io/aa_FileExample/farrago.txt" ) ) ;
				FileWriter out = new FileWriter ( new File ( "./src/jj_io/aa_FileExample/out.txt" ) ) ;
				) {

			//		BufferedReader in = new BufferedReader(new FileReader ( inputFile )) ;
			//		BufferedWriter out= new BufferedWriter(new FileWriter ( outputFile )) ;

			// NOTE: "stream" just means that it is always 8bit

			//		FileInputStream in = new FileInputStream ( inputFile ) ;
			//		FileOutputStream out = new FileOutputStream ( outputFile ) ;

			//		BufferedInputStream in = new BufferedInputStream( new FileInputStream ( inputFile ) ) ;
			//		BufferedOutputStream out = new BufferedOutputStream ( new FileOutputStream ( outputFile ) ) ;


			//		BufferedInputStream in = new BufferedInputStream( new FileInputStream ( inputFile ) ) ;
			//
			//		FileOutputStream outp = new FileOutputStream ( outputFileGz ) ;
			//		BufferedOutputStream outb = new BufferedOutputStream ( outp ) ;
			//		GZIPOutputStream out = new GZIPOutputStream ( outb ) ;

			int c ;
			while ( (c=in.read()) != -1 ) {
				out.write(c) ;
			}

			in.close() ;
			out.close() ;
		}
		System.out.println("done") ;

	}

}

