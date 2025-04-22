package cc_klassen.sandbox;


class Person{

	private int age ;

	Person() {
		System.out.println( "just called the no-argument constructor");
	}

	void incrementAge() {
		age+=1;
	}

	int getAge(){
		return age;
	}
//	public void setAge( double age ){
//		this.age = age;
//	}

	Person( int age ) {
		this.age = age;
	}

}
