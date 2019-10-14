package ee_polymorphism.bb_PolymorphWInterface;

class Dog implements AgentI, CanBark {

	private int id;
	
	Dog(int id){
		this.id = id;
	}
	
	@Override
	public int getId(){
		return id;
	}
	
	@Override
	public void move(){
		System.out.println("Dog move method; id: " + id);
	}
	
	@Override
	public void bark(){
		System.out.println("Dog bark method; id: " + id);
	}
	
}
