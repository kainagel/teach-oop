package nn_junit;

public class Utils{
	private static double result = Double.NEGATIVE_INFINITY;


	static double myMax( double aa, double bb, double cc ) {

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
