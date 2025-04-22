package hh_inheritanceFurtherDetails.hh_parameterObject;

public class Main {
	
	public static void main ( String [] args ){
		double a_x = 20.;
		double  a_y = 5.;
		double b_x = 13.;
		double b_y = 1.;
		Result result = aMethod( a_x, a_y, b_x, b_y );
		System.out.println( "result.x = " + result.getX() + "; result.y = " + result.getY() );
	}

	static Result aMethod( double a_x, double a_y, double b_x, double b_y ) {
		double c_x = a_x + b_x ;
		double c_y = a_y + b_y;
		Result result = new Result( c_x, c_y );
		return result;
	}

	static class Result {
		private double x;
		private double y;
		Result( double x, double y ) {
			this.x = x ;
			this.y = y;
		}
		double getX() {
			return this.x;
		}
		double getY() {
			return this.y;
		}
	}
}
