package gg_polymorphism.aa_Polymorph;
class Agent implements AgentI {
	private static int cnt = 0 ;

	private int id_ ;
	/* (non-Javadoc)
	 * @see gg_polymorphism.aa_Polymorph.AgentI#getId()
	 */
	public int getId() { return id_ ; }

	public Agent() { 
		id_ = cnt ; cnt++ ;
	}

	/* (non-Javadoc)
	 * @see gg_polymorphism.aa_Polymorph.AgentI#move(int)
	 */
	public void move (int ii) {
		System.out.println ( " agent move method on agent w/ id: " + getId() ) ;
	}

}
