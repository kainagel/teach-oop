package bb_methods_classes_intro.zz_test;

import static bb_methods_classes_intro.zz_test.Utils.myMaxForLong;

class Main{

	public static void main ( String[] args ){

		int aa = 15;
		int bb = 30;


		double vv = myMaxForLong( aa, bb );


		System.out.println( " max: " + vv );
	}
	private static long myMaxForLong( long aa, long bb ){
		long vv;
		if ( aa > bb ) {
			vv = aa;
		} else {
			vv = bb;
		}
		return vv;
	}


}
