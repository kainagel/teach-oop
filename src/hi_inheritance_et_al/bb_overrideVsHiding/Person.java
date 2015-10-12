package hi_inheritance_et_al.bb_overrideVsHiding;
class Person {
	
	private int age ;
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}

	void aMethod() {
		System.out.println ( " aMethod of Person " ) ;
	}
	
}

