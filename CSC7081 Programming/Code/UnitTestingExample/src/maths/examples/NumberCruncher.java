package maths.examples;

public class NumberCruncher {

	public NumberCruncher() {
		// TODO Auto-generated constructor stub
	}
	
	public int addNumbers(int n1, int n2) {
		return n1+n2;
	}
	
	public int addNumbers(int n1, int n2, int n3) {
		return n1+n2+n3;
	}
	
	public double divNumbers(double d1, double d2) throws IllegalArgumentException {
		if (d2==0) {
			throw new IllegalArgumentException("If you divide by zero, your computer will explode");
		}
		return d1/d2;
	}
	
	public double divNumbers(double d1, double d2, double d3) {
		return d1/d2/d3;
	}

}
