package hh_generics.ee_subTypesWildCards;
class Adult extends Person {
    private String Employer_ ;
    public void setEmployer ( String tmp ) {
	Employer_ = tmp ;
    }
    public String getEmployer ( ) {
	return Employer_ ;
    }
}