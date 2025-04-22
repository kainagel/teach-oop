package hh_inheritanceFurtherDetails.hh_parameterObject;

class Test {
	
	public static class ParameterObj {
		private int aa;
		private Object cc;
		private double bb;
		private String label;
		private int age;

		public ParameterObj(int aa, Object cc, double bb, String label, int age) {
			this.aa = aa;
			this.cc = cc;
			this.bb = bb;
			this.label = label;
			this.age = age;
		}

		public int getAa() {
			return aa;
		}

		public void setAa(int aa) {
			this.aa = aa;
		}

		public Object getCc() {
			return cc;
		}

		public void setCc(Object cc) {
			this.cc = cc;
		}

		public double getBb() {
			return bb;
		}

		public void setBb(double bb) {
			this.bb = bb;
		}

		public String getLabel() {
			return label;
		}

		public void setLabel(String label) {
			this.label = label;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
	}

	static void aMethod( ParameterObj parameterObject ) {
		int aa = parameterObject.getAa();
		aa++ ;
		Math.sqrt(parameterObject.getBb()) ;
	}
	
	public static void main( String[] args ) {
		int a1 = 0;
		double b1 = 0;
		Object c1 = null;
		int age = 22 ;
		
		ParameterObj parameterObject = new ParameterObj(a1, c1, b1, null, age);

		aMethod( parameterObject ) ;
	}

}
