package cc_klassen.kkStaticVsNonstaticVariables;

class Myclass {
	int cnt = 0 ;
	static int cnt2 = 0 ;

	Myclass() {
		cnt++ ;
		cnt2++ ;

		System.out.println(" the nonstatic cnt: " + cnt 
				+ " the static cnt2: " + cnt2 ) ;

	}

}
