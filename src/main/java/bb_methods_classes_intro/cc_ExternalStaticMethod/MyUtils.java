package bb_methods_classes_intro.cc_ExternalStaticMethod;
class MyUtils {
	static double max ( double aa , double bb ) {
		System.out.println ( " calling our own max function " ) ;
		if ( aa > bb ) {
			return aa ;
		} else {
			return bb ;
		}
	}
}