package griffith;

//Subclass RightAngledTriangle
class RightAngledTriangle extends Shape {
	private double base;
	private double height;

	public RightAngledTriangle(String name, double base, double height) {
		super(name);
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
		// Placeholder
		return 0;
	}

	@Override
	public double perimeter() {

		return 0;
	}

	@Override
	public String toString() {
		return super.toString() + ", Base: " + base + ", Height: " + height;
	}
}
