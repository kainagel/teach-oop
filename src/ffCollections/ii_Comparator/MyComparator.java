package ffCollections.ii_Comparator;

import java.util.*;

public class MyComparator implements Comparator<Agent> {

	@Override
	public int compare(Agent o1, Agent o2) {
		if ( o1.getAge() < o2.getAge() ) {
			return -1 ;
		} else if ( o1.getAge() == o2.getAge() ) {
			return 0 ;
		} else {
			return +1 ;
		}
	}

}
