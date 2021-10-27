package cc_klassen.aa_test;

class Person {

	private int age ;
	private String lastName ;
	private double height ;












	void printYourself() {
		System.out.println(  "lastName=" + lastName + "; age=" + age + "; height=" + height );
	}

	int getAge(){
		return age;
	}
	void setAge( int age ){
		this.age = age;
	}
	String getLastName(){
		return lastName;
	}
	void setLastName( String lastName ){
		this.lastName = lastName;
	}
	double getHeight(){
		return height;
	}
	void setHeight( double height ){
		this.height = height;
	}
}
