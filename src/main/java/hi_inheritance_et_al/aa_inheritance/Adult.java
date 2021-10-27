package hi_inheritance_et_al.aa_inheritance;
class Adult extends Person {
	
	private final String employer ;

	String getEmployer() { return this.employer ; }

	Adult( double age, String employer ) {
		super(age);
		this.employer = employer;
	}
	
}

