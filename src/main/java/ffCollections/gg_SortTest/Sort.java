package ffCollections.gg_SortTest;
import java.util.* ;

class Sort 
{

	public static void main ( String[] args ) {

		Integer[] abc = {33, 22, 17, 40, 390};
	
		List<Integer> ll = Arrays.asList(abc) ;
		
		System.out.println(ll);
		
		Collections.sort(ll); 
		
		System.out.println(ll);

	}

}
