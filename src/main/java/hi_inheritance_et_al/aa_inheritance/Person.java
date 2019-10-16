package hi_inheritance_et_al.aa_inheritance;

class Person {

	private double age ;
	
	public double getAge() { 
		return age ; 
	}
	
	public Person( double age ){
		this.age = age ;
	}
	
	public Person() {
		System.out.println("error: constructor introduced to make " +
				"code compile") ;
		System.exit(-1) ;
	}
	
	public void annualUpdate() {
		this.age++ ;
	}

}

