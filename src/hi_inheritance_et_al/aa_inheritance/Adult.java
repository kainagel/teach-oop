package hi_inheritance_et_al.aa_inheritance;
class Adult extends Person {
	
	private String employer ;

	public String getEmployer() { return this.employer ; }

	public void setEmployer( String employer ) { 
		this.employer = employer ;
	}
	
	void aMethod() {
		System.out.println( this.getAge() ) ;
	}
	
	Adult( String emp, int age ) {
		super(age) ;
		this.employer = emp ;
	}
	
	Adult( int age ) {
		this( null, age ) ;
	}
	
}

