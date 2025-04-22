package ffCollections.bb_ListWithPolymorphismAndCastAndInterface;

import java.util.*;


class Main {
	public static void main(String[] args) {

		List<AgentI> agents = new LinkedList<>() ;

		for ( int ii=1 ; ii<=5; ii++ ) {
			PersonImpl ag = new PersonImpl(ii) ;
			agents.add ( ag ) ;
		}
		for ( int ii=1 ; ii<=5; ii++ ) {
			DogImpl ag = new DogImpl(ii) ;
			agents.add ( ag ) ;
		}
		for ( int ii=1 ; ii<=5; ii++ ) {
			CayoteImpl ag = new CayoteImpl(ii) ;
			agents.add ( ag ) ;
		}

		for ( AgentI ag : agents ) {
			if ( ag instanceof CanHowlI ) {
				((CanHowlI)ag).howl();
			}
		}

	}
}














