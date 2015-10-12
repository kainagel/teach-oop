package hh_generics.ee_subTypesWildCards;
class Person {
	private String name_ ;
	public void setName ( String tmp ) {
		name_ = tmp ;
	}
	public String getName ( ) {
		return name_ ;
	}


	public void update() {
		System.out.println ( "calling the Person update function" ) ;
	}
}