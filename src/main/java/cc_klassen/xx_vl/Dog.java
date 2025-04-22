package cc_klassen.xx_vl;

class Dog implements Agent, CanBark {

	// internal state:
		private int id ;

	// constructor
		Dog( int id ) {
			this.id = id ;
		}

	// certified functionality
		@Override
		public int getId() {
			return id ;
		}
		@Override
		public void move() {
			System.out.println ( " Dog move method; id: " + id ) ;
		}

	@Override public void bark() {
		System.out.println ( " Dog bark method; id: " + id ) ;
	}

		// additional, non-certified functionality
}
