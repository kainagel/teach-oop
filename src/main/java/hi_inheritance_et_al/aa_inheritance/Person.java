package hi_inheritance_et_al.aa_inheritance;

class Person{

	private String lastName;
	private double age ;

	Person( double age ){
		this.age = age ;
	}

	double getAge() {
		return age ; 
	}

	void annualUpdate() {
		this.age++ ;
	}

	@Override
	public String toString() {
		return "lastName=" + this.lastName + "; age=" + this.age ;
	}

}

