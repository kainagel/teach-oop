package hi_inheritance_et_al.dd_composition;

public class PersonImpl implements PersonI {
	int age ;
	
	PersonImpl( int tmp ) {
		this.age = tmp ;
	}

	@Override
	public int getAge() {
		return this.age ;
	}

}
