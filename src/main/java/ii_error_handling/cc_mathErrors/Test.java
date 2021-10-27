package ii_error_handling.cc_mathErrors;

class Test {

	public static void main( String[] args ) 
	{

		int cc=-22 ;
		try {

			int aa = 0 ;
			int bb = 0 ;
			cc = aa/bb ;

		} catch ( ArithmeticException ee ) {
			ee.printStackTrace() ;
		}
//		System.err.println( " cc: " + cc ) ;

//		double aaa = 1 ;
//		double bbb = 0 ;
//		double ccc = aaa/bbb ;
//		double ddd = aaa/bbb ;
//		double eee = ccc/ddd ;
//		System.err.println ( " eee: " + eee ) ;
//
//		double result = Math.sqrt(-1) ;
		double result = Math.log(-1) ;
		System.out.println ( " result: " + result ) ;

		System.out.println ( " done" ) ;
	}

}
