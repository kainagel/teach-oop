package ee_polymorphism.bb_PolymorphWInterface;

class Adult implements AgentI{

	private int id;
	
	Adult(int id){
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	
	public void move(){
		System.out.println("Adult move method; id: " + id);
	}
	
	public void speak(){
		System.out.println("Adult speak method; id: " + id);
	}
	
}
