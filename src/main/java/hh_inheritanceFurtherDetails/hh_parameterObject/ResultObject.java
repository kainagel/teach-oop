package hh_inheritanceFurtherDetails.hh_parameterObject;

class ResultObject {

	private long ii;
	private double dd;
	private String str;

	public ResultObject(long ii, double dd, String str) {
		this.setIi(ii);
		this.setDd(dd);
		this.setStr(str);

		
		
	}

	public long getIi() {
		return ii;
	}

	public void setIi(long ii) {
		this.ii = ii;
	}

	public double getDd() {
		return dd;
	}

	public void setDd(double dd) {
		this.dd = dd;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

}
