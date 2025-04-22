package jj_io.aa_FileExample;
import java.io.*;
import java.util.zip.*;

class Test
{

	public static void main ( String[] args )
	{


		File outputFileGz = new File ( "./src/main/java/jj_io/aa_FileExample/out3.txt.gz" ) ;

		final File inputFile = new File( "./src/main/java/jj_io/aa_FileExample/farrago.txt" );
//		final File outputFile = new File( "./src/main/java/jj_io/aa_FileExample/out9.txt" );

		try (
				FileReader in = new FileReader ( inputFile ) ;
//				FileWriter out = new FileWriter ( outputFile ) ;

//				BufferedReader in = new BufferedReader( in1 ) ;
//				BufferedWriter out= new BufferedWriter( out1 );

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
//				System.out.println( "integer value=" + c + "; character=" + (char) c);
				out.write( c ) ;
			}

		} catch (IOException e) {
			throw new RuntimeException(e) ;
		}

		System.out.println("done") ;

	}

}

