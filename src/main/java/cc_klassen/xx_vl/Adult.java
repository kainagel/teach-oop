package cc_klassen.xx_vl;

class Adult implements Agent, CanSpeak{
	private int id;
	@Override
	public int getId(){
		return this.id;
	}
	@Override
	public void move(){
		System.out.println(  "calling Adult move method" );
	}
	public void speak() {
		System.out.println(  "calling Adult speak method" );
	}
}
