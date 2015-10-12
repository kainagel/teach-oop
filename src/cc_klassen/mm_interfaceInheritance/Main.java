package cc_klassen.mm_interfaceInheritance;

class Main {

	public static void main(String[] args) {
		AdultI adult = new Person() ;
		
		adult.setEmployer("TU Berlin");
		System.out.println( " employer: " + adult.getEmployer() );
	}

}
