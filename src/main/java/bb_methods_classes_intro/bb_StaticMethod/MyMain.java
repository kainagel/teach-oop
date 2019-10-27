package bb_methods_classes_intro.bb_StaticMethod;

class MyMain{
	public static void main  ( String[] args ) {
		double aa = 15 ; double bb = 30 ;
		double cc = MyMath.plus( aa, bb );
		System.out.println ( " cc: " + cc ) ;
	}


	//	static int myMax ( int aa, int bb ) {
//		System.out.println( "using int, int myMax ") ;
//		if ( aa > bb ) {
//			return aa ;
//		} else {
//			return bb ;
//		}
//	}


}
