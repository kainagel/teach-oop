package bb_methods_classes_intro.zz_test;

class Test {
	
	public static void main( String[] args ) {
		double cc = Test.doSomethingWith( 1, 2 ) ;
		System.out.println( "cc: " + cc );
		
	}

	static double doSomethingWith( double aa, int bb ) {
		System.out.println( "using the double/int method");
		return aa ;
	}

}
