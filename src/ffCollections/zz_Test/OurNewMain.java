package ffCollections.zz_Test;

import java.util.*;

public class OurNewMain {
	
	public static void main(String[] args) {
		HashMap<String,Person> container = new HashMap<>() ;
		
		Person p0 = new Person() ;
		p0.name = "Meier" ; p0.age = 22 ;
		container.put("Meier", p0) ;
		
		Person p1 = new Person() ;
		p1.name = "Schmidt" ; p1.age = 43 ;
		container.put("Schmidt",p1) ;
		
		for ( Person pp : container.values() ) {
			System.out.println( "pp=" + pp.name) ;
		}
	}

}
