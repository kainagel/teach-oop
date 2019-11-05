package nn_junit;

public class Utils{


	static double myMax( double aa, double bb, double cc ) {
		double result = Double.MIN_VALUE ;
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
