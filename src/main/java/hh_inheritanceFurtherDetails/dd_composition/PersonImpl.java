package hh_inheritanceFurtherDetails.dd_composition;

class PersonImpl implements PersonI {
	int age ;
	
	PersonImpl( int tmp ) {
		this.age = tmp ;
	}

	@Override
	public int getDriverAge() {
		return this.age ;
	}

}
