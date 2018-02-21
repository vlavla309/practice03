package prob06;

public abstract class Arithmetic {
	private int a;
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	private int b;

	public void setValue(int a, int b) {
		setA(a);
		setB(b);
	}
	
	public abstract int calculate();
}
