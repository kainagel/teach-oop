package hi_inheritance_et_al.bb_staticBinding;

class Adult extends Person {
	
	private String employer ;
	String getEmployer() { return this.employer ; }
	public void setEmployer( String employer ) { 
		this.employer = employer ;
	}
	
	void aMethod() {
		System.out.println( "calling Adult aMethod" ) ;
	}
	
	
}

