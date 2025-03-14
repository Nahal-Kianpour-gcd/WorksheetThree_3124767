package griffith;

class Rhombus extends Shape {
	private double diagonal1;
	private double diagonal2;

	public Rhombus(String name, double diagonal1, double diagonal2) {
		super(name);
		this.diagonal1 = diagonal1;
		this.diagonal2 = diagonal2;
	}

	public double getDiagonal1() {
		return diagonal1;
	}

	public void setDiagonal1(double diagonal1) {
		this.diagonal1 = diagonal1;
	}

	public double getDiagonal2() {
		return diagonal2;
	}

	public void setDiagonal2(double diagonal2) {
		this.diagonal2 = diagonal2;
	}

	@Override
	public double area() {
		// Placeholder as per instructions
		return 0;
	}

	@Override
	public double perimeter() {
		// Placeholder as per instructions
		return 0;
	}

	@Override
	public String toString() {
		return super.toString() + ", Diagonal1: " + diagonal1 + ", Diagonal2: " + diagonal2;
	}
}
