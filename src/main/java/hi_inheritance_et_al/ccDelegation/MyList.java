package hi_inheritance_et_al.ccDelegation;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class MyList extends ArrayList<String>
{
	@Override public void add( int i, String str ) {
		System.out.println( "adding something");
		super.add( i, str) ;
	}
}
