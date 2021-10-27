package nn_junit;

public class Utils{


	static double myMax( double aa, double bb, double cc ) {
		double result = Double.NEGATIVE_INFINITY;

		if ( aa > result ) {
			result = aa ;
		}
		if ( bb > result ) {
			result = bb ;
		}
		if ( cc > result ) {
			result = cc ;
		}
		return result ;
	}
	
}
