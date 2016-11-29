package gg_polymorphism.bb_PolymorphWInterface;

class Dog implements AgentI{

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
