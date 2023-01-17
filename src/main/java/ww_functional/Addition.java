package ww_functional;

public class Addition implements ArithmeticOperation {

	@Override
	public Double apply(Double aDouble, Double aDouble2) {
		return aDouble + aDouble2;
	}

}
