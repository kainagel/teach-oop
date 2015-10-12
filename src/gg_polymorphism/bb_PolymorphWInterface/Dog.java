package gg_polymorphism.bb_PolymorphWInterface;
class Dog implements AgentI, CanBark, Comparable, Runnable {
	private int id ;
	Dog( int id ) {
		this.id = id ;
	}
	@Override
	public int getId() {
		return id ;
	}
	@Override
	public void move () {
		System.out.println ( " dog move method on dog " ) ;
	}
	@Override
	public void bark () {
		System.out.println( " dog BARK method on dog " ) ;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
