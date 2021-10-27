package ii_error_handling.bb_error;
import java.io.* ;

class Test {


	public static void main( String[] args )
	{
		String text = "This is our text." + System.lineSeparator() + "We like it very much." ;

		writeFile( "abc/outfile.txt", text ) ;

		for ( int ii=0 ; ii<10000 ; ii++ ){
			System.out.println( "done" );
		}
	}











	private static void writeFile( String filename, String text ) {
		try{
			FileWriter fw;
			fw = new FileWriter ( new File ( filename ) );
			fw.write( text ) ;
			fw.close();
		} catch( IOException e ){
			e.printStackTrace();
		} finally {
			System.out.println("entering finally clause");
		}
	}

}
