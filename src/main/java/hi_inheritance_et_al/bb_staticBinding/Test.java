package hi_inheritance_et_al.bb_staticBinding;

class Test {

	static void aMethod2( Person person ) {
		System.out.println("calling PERSON aMethod2") ; 
	} 
	static void aMethod2( Adult adult ) {
		System.out.println("calling ADULT aMethod2") ;
	}
	
	public static void main  ( String[] args ) {

		Person ppp = new Adult() ;
		ppp.setAge(33) ;

		
		ppp.aMethod() ;
		aMethod2(ppp) ;
		
	}
}
