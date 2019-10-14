package ii_error_handling.bb_error;
import java.io.* ;

class Test {
	
	static void writeFile ( String filename, String text )  
	{

			try {
				FileWriter fw;
				fw = new FileWriter ( new File ( filename ) );
				fw.write( text ) ;
				fw.close();
			} catch (IOException e) {
//				e.printStackTrace(); 
				throw new RuntimeException(e ) ;
			}

	}

	public static void main( String[] args ) 
	{
		try {
		String text = "This is our text.\nWe like it very much." ;
		writeFile( "abc/outfile.txt", text ) ;

		System.out.println( "done");
		} catch ( Exception ee ) {
			System.err.println( "Dear Customer, your code has produced an error.  Please call customer support and name "
					+ "the following error code:");
			System.err.println( ee.getMessage() );
		}
	}

}
