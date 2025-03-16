package griffith;

// Subclass Rhombus, inherits from Shape
class Rhombus extends Shape {
	private double diagonal1; // First diagonal length
	private double diagonal2; // Second diagonal length

	// Constructor to initialize Rhombus with name and diagonals
	public Rhombus(String name, double diagonal1, double diagonal2) {
		super(name); // Call the constructor of the parent class (Shape)
		this.diagonal1 = diagonal1;
		this.diagonal2 = diagonal2;
	}

	// Getter for the first diagonal
	public double getDiagonal1() {
		return diagonal1;
	}

	// Setter for the first diagonal
	public void setDiagonal1(double diagonal1) {
		this.diagonal1 = diagonal1;
	}

	// Getter for the second diagonal
	public double getDiagonal2() {
		return diagonal2;
	}

	// Setter for the second diagonal
	public void setDiagonal2(double diagonal2) {
		this.diagonal2 = diagonal2;
	}

	// Override the area() method to calculate the area of a rhombus using (d1 * d2)
	// dividing by 2
	@Override
	public double area() {
		return (diagonal1 * diagonal2) / 2;
	}

	// Override the perimeter() method to calculate the rhombus perimeter
	// The formula: 4 * side length, where side = sqrt((d1/2)² + (d2/2)²)
	@Override
	public double perimeter() {
		double side = Math.sqrt((diagonal1 / 2) * (diagonal1 / 2) + (diagonal2 / 2) * (diagonal2 / 2));
		return 4 * side;
	}

	// Override toString() to provide a descriptive string representation of the
	// Rhombus
	@Override
	public String toString() {
		return super.toString() + ", Diagonal1: " + diagonal1 + ", Diagonal2: " + diagonal2;
	}
}
