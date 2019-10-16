package ffCollections.kk_BinarySearch;
class Agent implements Comparable<Agent>
{

	private Integer id_ ;
	public Integer getId() { return id_ ; }

	private double age_ ;
	public double getAge() { return age_ ; }
	public void setAge( double age ) { age_ = age ; }

	public Agent ( Integer id , double age ) { id_ = id ; age_ = age ;}
	public Agent ( Integer id ) { id_ = id ; }
	
	@Override
	public String toString() {
		return id_.toString() ;
	}

	@Override
	public int compareTo ( Agent other ) 
	{
		String meStr    = this.toString() ;
		String otherStr = other.toString() ;
		
		return meStr.compareTo( otherStr ) ;
	}

}
