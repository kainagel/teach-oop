package ff_collections.gg_SortTest;
import java.util.* ;

class Sort 
{

	public static void main ( String[] args ) {

		String[] abc = {"33", "22", "17", "40"};
	
		List<String> ll = Arrays.asList(abc) ;
		
		System.out.println(ll);
		
		Collections.sort(ll); 
		
		System.out.println(ll);

	}

}
