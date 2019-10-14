package cc_klassen.ll_interfaceDemo;
class Main {
	public static void main  ( String[] args ) {
		
		 Employable adult = new AdultImpl1() ;
		 
		 adult.setEmployer("tu berlin");
		 
		 adult.getEmployer() ;
		 
//		 adult.getAge() ;
		
	}
}