package ii_error_handling.bb_error;
import java.io.* ;

class Test {

	static void writeFile ( String filename, String text ) 
	{
			try {

				FileWriter fw = new FileWriter ( new File ( filename ) );
//				fw.write( text ) ;
//				fw.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public static void main( String[] args )  
	{
		String text = "This is our text.\nWe like it very much." ;
		writeFile( "abc/outfile.txt", text ) ;

		System.out.println( "done");
	}

}
