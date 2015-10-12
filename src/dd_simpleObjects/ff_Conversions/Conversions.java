package dd_simpleObjects.ff_Conversions;

import java.util.*;

public class Conversions {
	
	public static void main ( String[] args ) {
		
//		String str = "5678" ;

//		Double dblObj = Double.parseDouble(str) ;
		
		double dbl = 3.14 ;
		Double dblObj = new Double( dbl ) ;
		
		System.out.println( " dblObj: " + dblObj 
				+ " toString: " + dblObj.toString() 
				+ " to??:  " + dblObj.doubleValue() ) ;
		
		Double.parseDouble("13") ;
		
//		System.out.println( " String.valueOf(Double): " + String.valueOf( dblObj ) ) ;
//
//		System.out.println( " String.valueOf(double): " + String.valueOf( 3.14 ) ) ;
//		
//
//		Double.parseDouble(str) ;
//		
//		dblObj.doubleValue();
		
//		dblObj.toString() ;
//		
//		Double.parseDouble( str ) ;
		
	}

}
