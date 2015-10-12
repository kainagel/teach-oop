package cc_klassen.zzTest;

class Person {

	private String name ;
	private double age;
	
	void walk() {
		System.out.println("calling the walk method") ;
	}

	double getAge() {
		return age;
	}

	void setAge(double var) {
		age = var;
	}
	
	String getName() {
		return name;
	}

	void setName(String str ) {
		name = str ;
	}
	
}
