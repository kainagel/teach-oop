package ee_polymorphism.aa_PolymorphWInheritance;

class Test {
	public static void main  ( String[] args ) {
		
		Child daughter = new Child();
		daughter.setAge(7);
//		daughter.setSchool("Grundschule der Dreckspatzen");
		
		Adult mother = new Adult();
		mother.setAge(35);
//		mother.setEmployer("TU Berlin");
		
		System.out.println( mother.getAge() );
		System.out.println( daughter.getAge() );
//		System.out.println( mother.getAgeInMonth() );
		
		// folgendes geht nicht:
//		System.out.println("Mutter ging frueher zur " + mother.getSchool() );
//		System.out.println("Tochter will spaeter zu " + daughter.getEmployer() );
		
//		mother.aMethod();
		
//		System.out.println( mother.toString() );		
	}
}