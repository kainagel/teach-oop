/**
 * 
 */
package ff_collections.ii_Comparator;

import java.util.Comparator;

import ff_collections.hh_Comparable.Agent;

/**
 * @author nagel
 *
 */
public class IdComparator implements Comparator<Agent> {

	public int compare(Agent ag1, Agent ag2) {
		
		if ( ag1.getId() < ag2.getId() ) {
			return -1 ; 
		} else if ( ag1.getId() == ag2.getId() ) {
			return 0 ;
		} else {
			return +1 ;
		}
	}


}
