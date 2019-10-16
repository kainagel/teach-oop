package bb_methods_classes_intro.bb_StaticMethodTest;
class MyTest {
	public static void main  ( String[] args ) {
		double cc ;
		double aa = 15 ; double bb = 30 ;
		double cc1;
		cc1 = myMethod(aa, bb);
		cc = cc1;
		System.out.println ( " cc: " + cc ) ;
	}

	private static double myMethod(double aa, double bb) {
		double cc1;
		cc1 = Math.sin(aa) + Math.sin(bb) ;
		return cc1;
	}
	

//	static double myMax ( double aa , double bb ) {
//		System.out.println( "using double,double myMax ") ;
//		if ( aa > bb ) {
//			return aa ;
//		} else {
//			return bb ;
//		}
//	}
	
//	static int myMax ( int aa, int bb ) {
//		System.out.println( "using int, int myMax ") ;
//		if ( aa > bb ) {
//			return aa ;
//		} else {
//			return bb ;
//		}
//	}


}