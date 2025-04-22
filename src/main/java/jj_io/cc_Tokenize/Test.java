package jj_io.cc_Tokenize;
import java.io.*;
import java.util.*;

class Test
{

	public static void main ( String[] args ) 
	{
		try {
			File inputFile = new File ( "./src/main/java/jj_io/cc_Tokenize/berlinWeather.csv" ) ;

			FileReader inp = new FileReader ( inputFile ) ;

			BufferedReader in = new BufferedReader( inp ) ;
			
			String line;
			while ( (line=in.readLine()) != null ) {
				List<String> list = Arrays.asList( line.split(" *" ) );

				for( String entry : list ){
					System.out.println( entry );
				}

			}

		} catch ( Exception e ) {
			System.out.println ( e ) ;
		}
	}

}
