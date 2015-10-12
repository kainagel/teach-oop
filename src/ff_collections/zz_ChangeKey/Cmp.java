package ff_collections.zz_ChangeKey;
import java.util.* ;

class Cmp implements Comparator {
    public int compare ( Object o1, Object o2 ) {
 	Agent a1 = (Agent) o1 ;
	Agent a2 = (Agent) o2 ;
	if ( a1.getAge() > a2.getAge() ) {
	    return 1 ;
	} else if ( a1.getAge() == a2.getAge() ) {
	    return 0 ;
	} else {
	    return -1 ;
	}
    }
}

