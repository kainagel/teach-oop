package cc_klassen.aa_test;

class Person{

	private int yearOfBirth ;

//	Person() {
//
//	}

	Person( int yearOfBirth ) {
		this.yearOfBirth = yearOfBirth;
	}

//	void setAge( int val ) {
//		this.age = val;
//	}

	int getAge() {
		return 2024 - yearOfBirth;
	}

//	void print( String additionalInfo ) {
//		System.out.println( "calling the PERSON print method");
//		System.out.println( "additionalInfo=" + additionalInfo );
//	}

	void print() {
		System.out.println( "calling the PERSON print method");
	}


}
