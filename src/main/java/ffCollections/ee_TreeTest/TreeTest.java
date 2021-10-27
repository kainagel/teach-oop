package ffCollections.ee_TreeTest;
import java.util.*;

class TreeTest 
{

	/**
	 * @param args
	 */
	public static void main ( String[] args ) 
	{
//		SortedSet<Double> doubles = new TreeSet<>() ;
		Set<Double> doubles = new LinkedHashSet<Double>() ;
		for ( int ii=0 ; ii<6 ; ii++ ) {
			double rnd = Math.random() ;
			System.out.println ( " rnd: " + rnd ) ;
			doubles.add( rnd ) ;
		}
		for ( Double dbl : doubles ) {
			System.out.println ( dbl) ;
		}
	}
}
