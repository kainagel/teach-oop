package bb_methods_classes_intro.bb_StaticMethodTest;

public class MyMath {
	static double myMax ( double aa , double bb ) {
		System.out.println( "using double,double myMax ") ;
		if ( aa > bb ) {
			return aa ;
		} else {
			return bb ;
		}
	}

}
