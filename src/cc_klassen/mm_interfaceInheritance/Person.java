package cc_klassen.mm_interfaceInheritance;

public class Person implements AdultI {

	private String employer;
	private int age;

	@Override
	public void setAge(int tmp) {
		this.age = tmp ;
	}

	@Override
	public int getAge() {
		return this.age ;
	}

	@Override
	public void setEmployer(String str) {
		employer = str ;
	}

	@Override
	public String getEmployer() {
		return employer ;
	}

}
