package cc_klassen.aa_test;

public class Param {
	private int age;
	private String lastName;
	private boolean hasDrivingLic;

	public Param(int age, String lastName,
			boolean hasDrivingLic) {
		this.age = age;
		this.lastName = lastName;
		this.hasDrivingLic = hasDrivingLic;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isHasDrivingLic() {
		return hasDrivingLic;
	}

	public void setHasDrivingLic(boolean hasDrivingLic) {
		this.hasDrivingLic = hasDrivingLic;
	}
}