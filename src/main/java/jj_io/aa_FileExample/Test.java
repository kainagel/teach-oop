package jj_io.aa_FileExample;
import java.io.*;
import java.util.zip.*;

class Test
{

	public static void main ( String[] args ) 
	{


				File outputFileGz = new File ( "./src/main/java/jj_io/aa_FileExample/out.txt.gz" ) ;

		final File inputFile = new File( "./src/main/java/jj_io/aa_FileExample/farrago.txt" );
//		final File outputFile = new File( "./src/main/java/jj_io/aa_FileExample/out.txt" );
		try (
				FileReader in = new FileReader ( inputFile ) ;
//				FileWriter out = new FileWriter ( outputFile ) ;

//				BufferedReader in = new BufferedReader(new FileReader ( inputFile )) ;
//				BufferedWriter out= new BufferedWriter(new FileWriter ( outputFile )) ;

				// NOTE: "stream" just means that it is always 8bit

//						FileInputStream in = new FileInputStream ( inputFile ) ;
//						FileOutputStream out = new FileOutputStream ( outputFile ) ;
//
//						BufferedInputStream in = new BufferedInputStream( new FileInputStream ( inputFile ) ) ;
//						BufferedOutputStream out = new BufferedOutputStream ( new FileOutputStream ( outputFile ) ) ;


				//		BufferedInputStream in = new BufferedInputStream( new FileInputStream ( inputFile ) ) ;
				//
					FileOutputStream outp = new FileOutputStream ( outputFileGz ) ;
					BufferedOutputStream outb = new BufferedOutputStream ( outp ) ;
					GZIPOutputStream out = new GZIPOutputStream ( outb ) ;
				) {

			int c ;
			while ( (c=in.read()) != -1 ) {
				out.write(c) ;
			}

		} catch (IOException e) {
			throw new RuntimeException(e) ;
		}
		System.out.println("done") ;

	}

}

