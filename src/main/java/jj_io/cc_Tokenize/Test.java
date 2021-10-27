package jj_io.cc_Tokenize;
import java.io.*;
import java.util.*;

class Test
{

	public static void main ( String[] args ) 
	{
		try {
			File inputFile = new File ( "./src/main/java/jj_io/cc_Tokenize/farrago.txt" ) ;

			FileReader inp = new FileReader ( inputFile ) ;

			BufferedReader in = new BufferedReader( inp ) ;
			
			String line = null ;
			while ( (line=in.readLine()) != null ) {
				List<String> list = Arrays.asList( line.split(" +|\n|\t+" ) );
//				List<String> list = Arrays.asList( line.split(" " ) );
				for( String string : list ){
					System.out.println( string );
				}
			}

		} catch ( Exception e ) {
			System.out.println ( e ) ;
		}
	}

}
