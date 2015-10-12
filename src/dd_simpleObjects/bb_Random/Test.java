package dd_simpleObjects.bb_Random;
import java.util.Random ;

class Test {
	public static void main  ( String[] args ) {
		
		Random rnd1 = new Random() ;
		Random rnd2 = new Random() ;
		
		rnd1.setSeed(1236);
		rnd2.setSeed(1236);
		
		rnd1.nextDouble() ;
		
		for ( int ii=0 ; ii<5 ; ii++ ) {
			double abc = rnd2.nextDouble();
			System.out.println ( " rnd1: " + rnd1.nextDouble() +
					"; rnd2: " + abc ) ;
		}

	
	
	}
}