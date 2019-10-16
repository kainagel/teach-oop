package ii_error_handling.dd_assert;
import java.io.* ;

class Test {

	public static void main( String[] args ) 
	{
		double bb = -1 ;

		assert ( bb >= 0. ) ; 
		double aa = 0. ;
		if ( bb >= 0. ) {	
			aa = Math.sqrt( bb ) ;
		} else {
			System.exit(-1) ;
		}

		System.out.println ( " aa: " + aa ) ;

	}

}
