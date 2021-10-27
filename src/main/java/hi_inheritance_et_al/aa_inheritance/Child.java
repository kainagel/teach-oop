package hi_inheritance_et_al.aa_inheritance;
class Child extends Person {
	
	private String school ;


	Child( double age, String school ) {
		super( age );
		this.school = school;
	}


	String getSchool() {
		return this.school ; 
	}

	@Override
	void annualUpdate() {
		super.annualUpdate();
		if ( getAge() > 12 ) {
			this.school = "ABC-Gymnasium";
		}
	}

	@Override
	public String toString() {
		return super.toString() + "; school=" + school;
	}

	
}

