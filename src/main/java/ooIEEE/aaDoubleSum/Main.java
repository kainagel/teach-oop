package ooIEEE.aaDoubleSum;

import java.util.*;

public class Main {

	public static void main(String[] args) {
				
		List<Household> hhs = new ArrayList<>() ;
		for ( long ii=0 ; ii<8*1000*1000 ; ii++ ) {
			Household hh = new Household(20000.*Math.random(),20000.*Math.random()) ;
			hhs.add( hh ) ;
		}
		
		float sumG = 0.f ; float sumC = 0.f ; float sum = 0.f ;
		for ( Household hh : hhs ) {
			sumG += hh.generation ;
			sumC += hh.consumption ;
			sum += hh.generation ;
			sum -= hh.consumption ;
		}
		System.out.println( "sumG-sumC: " + (sumG-sumC) + "; sum: " + sum ) ;
		
	}
	
	private static class Household {
		double generation ;
		double consumption ;
		Household( double aa, double bb ) {
			generation = aa ;
			consumption = bb ;
		}
	}

}
