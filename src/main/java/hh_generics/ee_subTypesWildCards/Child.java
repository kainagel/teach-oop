package hh_generics.ee_subTypesWildCards;
class Child extends Person {
	private String school_ ;
	public void setSchool ( String tmp ) {
		school_ = tmp ;
	}
	public String getSchool ( ) {
		return school_ ;
	}

	public void update() {
		System.out.println ( "calling the Child update function" ) ;
	}

}