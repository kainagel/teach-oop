package hh_generics.bb_simple;

class Adult extends Person {
	Adult(String name) {
		super(name);
	}
	private String workplace_ ;
	public void setWorkplace ( String str ) {
		workplace_ = str ;
	}
	public String getWorkplace ( ) {
		return workplace_ ;
	}
	@Override
	public String toString() {
		return (super.toString() + "; workplace: " + workplace_) ;
	}
}

