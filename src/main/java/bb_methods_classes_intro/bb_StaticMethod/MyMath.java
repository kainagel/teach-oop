package bb_methods_classes_intro.bb_StaticMethod;

class MyMath {
	static double plus( double aa, double bb ){
		double cc1;
		cc1 = aa + bb;
		return cc1;
	}
	/* package-private */ static double myMax ( double aa , double bb ) {
		System.out.println( "using double,double myMax ") ;
		if ( aa > bb ) {
			return aa ;
		} else {
			return bb ;
		}
	}
}
