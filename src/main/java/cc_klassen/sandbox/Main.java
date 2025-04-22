package cc_klassen.sandbox;

/* package-private */ class Main{

	public static void main( String[] args ){








		

		Person person = new Person();

		Person person2 = new Person(20);

		System.out.println( person.getAge() );
		System.out.println( person2.getAge() );

		person.incrementAge();

		System.out.println( person.getAge() );
		System.out.println( person2.getAge() );


	}
}

