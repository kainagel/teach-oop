package bb_methods_classes_intro.ee_StaticVariable;

public class Main {

	static int addOne(int cnt) {
		cnt += 1 ;
		return cnt;
	}

	static int addTwo( int cnt) {
		cnt += 2 ;
		return cnt;
	}

	public static void main ( String[] args ) {
		int cnt = 0;


		cnt = addOne(cnt) ;
		cnt = addTwo(cnt) ;
		System.out.println("cnt=" + cnt ) ;
	}
}
