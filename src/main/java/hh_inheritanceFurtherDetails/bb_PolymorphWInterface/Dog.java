package hh_inheritanceFurtherDetails.bb_PolymorphWInterface;

class Dog implements DogI {

	private int id;
	
	Dog(int id){
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	
	public void move(){
		System.out.println("Dog move method; id: " + id);
	}
	
	public void bark(){
		System.out.println("Dog bark method; id: " + id);
	}
	
}
