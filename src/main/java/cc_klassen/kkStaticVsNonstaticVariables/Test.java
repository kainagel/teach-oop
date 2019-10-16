package cc_klassen.kkStaticVsNonstaticVariables;

public class Test {

	public static void main(String[] args) {

		Printer prn = new Printer() ;
		prn.prettyPrint("def");
		prn.prettyPrint("def");
		prn.prettyPrint("def");
		
		Printer prn2 = new Printer() ;
		prn2.prettyPrint("def");
		
		prn.prettyPrint("def");
		
	}

}
