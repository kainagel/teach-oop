package bb_methods_classes_intro.zz_test;

class Utils{

	static double myMax( double aa, double bb ){
		double vv;
		if ( aa > bb ) {
			vv = aa;
		} else {
			vv = bb;
		}
		return vv;
	}
	static long myMaxForLong( long aa, long bb ){
		long vv;
		if ( aa > bb ) {
			vv = aa;
		} else {
			vv = bb;
		}
		return vv;
	}

}
