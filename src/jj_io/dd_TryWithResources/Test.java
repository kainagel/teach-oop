package jj_io.dd_TryWithResources;
import java.io.*;
import java.util.zip.*;

class Test
{

	public static void main ( String[] args ) 
	{

		File inputFile = new File ( "./src/jj_io/dd_TryWithResources/farrago.txt" ) ;
		File outputFile = new File ( "./src/jj_io/dd_TryWithResources/out.txt" ) ;

		try (
			FileReader in = new FileReader ( inputFile ) ;
			FileWriter out = new FileWriter ( outputFile ) ;
				) {

			int c ;
			while ( (c=in.read()) != -1 ) {
				out.write(c) ;
			}

			in.close() ;
			out.close() ;
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("done") ;

	}

}

