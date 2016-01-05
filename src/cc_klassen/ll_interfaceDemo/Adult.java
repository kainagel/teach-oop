/**
 * 
 */
package cc_klassen.ll_interfaceDemo;

/**
 * @author nagel
 *
 */
class Adult implements PersonI, Employable {

	private int age;
	private String employer;

	public int getAge() {
		return age ;
	}

	public String getEmployer() {
		return employer;
	}

	@Override
	public void setEmployer(String employer) {
		this.employer = employer ;
	}

}
