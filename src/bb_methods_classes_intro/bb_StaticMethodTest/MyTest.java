package bb_methods_classes_intro.bb_StaticMethodTest;
class MyTest {
	public static void main  ( String[] args ) {
		double cc ;
		float aa = -15 ; float bb = -30 ;
		cc = myMax( aa, bb ) ;
		System.out.println ( " cc: " + cc ) ;
	}
	

	static double myMax ( float aa , float bb ) {
		System.out.println( "using double,double myMax ") ;
		if ( aa > bb ) {
			return aa ;
		} else {
			return bb ;
		}
	}
	
	static int myMax ( int aa, int bb ) {
		System.out.println( "using int, int myMax ") ;
		if ( aa > bb ) {
			return aa ;
		} else {
			return bb ;
		}
	}


}