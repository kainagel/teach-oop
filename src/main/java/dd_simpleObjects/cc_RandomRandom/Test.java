package dd_simpleObjects.cc_RandomRandom;
import java.util.Random;
class Test {

	public static void main  ( String[] args ) {
		Random rnd1 = new Random() ;
		Random rnd2 = new Random() ;
		
		rnd1.setSeed(4711) ;
		rnd2.setSeed(4711);
		
//		for ( int ii=0 ; ii<100; ii++ ) {
//			System.out.println ( " ii: " + ii
//		}
		
		for ( int ii=0 ; ii<100 ; ii++ ) {
			System.out.println ( " ii: " + ii
					+ " rnd1: " + rnd1.nextDouble()
					+ " rnd1: " + rnd1.nextDouble()
					+ " rnd2: " + rnd2.nextDouble() 
					) ;
		}
	}
}