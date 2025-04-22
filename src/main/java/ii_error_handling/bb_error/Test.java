package ii_error_handling.bb_error;
import java.io.* ;

class Test {


	public static void main( String[] args ) {
		extracted();
	}

	private static void extracted() {
		String text = "This is our text." + System.lineSeparator() + "We like it very much." ;


		FileWriter fileWriter = null;
		try{
			fileWriter = new FileWriter( "abc/myoutputfile.txt" );
			fileWriter.write( text );
			fileWriter.close();
		} catch( IOException e ){
			throw new RuntimeException( e );
		}

		for ( int ii=0 ; ii<1000; ii++ ){
//			System.out.println( "... lots of output ..." );
		}


	}

	void tyrOut() {
		throw new RuntimeException( "my exception" );
	}

}
