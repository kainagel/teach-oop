package hh_inheritanceFurtherDetails.bb_PolymorphWInterface;

class Adult implements AgentI {

	private int id;
	
	Adult(int id){
		this.id = id;
	}
	
	@Override
	public int getId(){
		return id;
	}
	
	@Override
	public void move(){
		System.out.println("Adult move method; id: " + id);
	}
	
	public void speak(){
		System.out.println("Adult speak method; id: " + id);
	}

//	@Override public void speak( String msg ){
//		throw new RuntimeException( "not implemented" );
//	}
}
