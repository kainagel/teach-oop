package bb_methods_classes_intro.zz_test;

class Main{
	
	public static void main( String[] args ) {
		double cc = Main.doSomethingWith( 1, 2 ) ;
		System.out.println( "cc: " + cc );
		
	}

	static double doSomethingWith( double aa, int bb ) {
		System.out.println( "using the double/int method");
		return aa ;
	}

}
