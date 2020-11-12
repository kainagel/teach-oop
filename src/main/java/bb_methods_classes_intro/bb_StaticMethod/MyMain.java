package bb_methods_classes_intro.bb_StaticMethod;

class MyMain{
	public static void main  ( String[] args ) {
		double aa = 15 ; double bb = 30 ;
		double cc = myMax( aa, bb );
		System.out.println ( " cc: " + cc ) ;
	}
	private static double myMax( double aa, double bb ){
		double cc;
		if ( aa > bb ) {
			cc = aa ;
		} else {
			cc = bb ;
		}
		return cc;
	}

}
