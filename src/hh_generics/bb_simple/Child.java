package hh_generics.bb_simple;

class Child extends Person {
	Child(String name) {
		super(name);
	}
	private String school_ ;
	public void setSchool ( String str ) {
		school_ = str ;
	}
	public String getSchool ( ) {
		return school_ ;
	}
	@Override
	public String toString() {
		return ( super.toString() + "; school: " + school_ ) ;
	}
}

