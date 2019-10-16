package jj_io.cc_Tokenize;
import java.io.*;
import java.util.*;

class Test
{

	public static void main ( String[] args ) 
	{
		try {
			File inputFile = new File ( "./src/jj_io/cc_Tokenize/farrago.txt" ) ;

			FileReader inp = new FileReader ( inputFile ) ;

			BufferedReader in = new BufferedReader( inp ) ;
			
			String line = null ;
			while ( (line=in.readLine()) != null ) {
				String[] array = line.split(" +|\n|\t+") ;
				for ( int ii=0 ; ii<array.length ; ii++ ) {
					System.out.println( array[ii] ) ;
				}
			}

		} catch ( Exception e ) {
			System.out.println ( e ) ;
		}
	}

}
