package griffith;

// Subclass Circle, inherits from Shape
class Circle extends Shape {
	private double radius; // Stores the radius of the circle

	// Constructor to initialize Circle with name and radius
	public Circle(String name, double radius) {
		super(name); // Call the constructor of the parent class (Shape)
		this.radius = radius;
	}

	// Getter method to retrieve the radius
	public double getRadius() {
		return radius;
	}

	// Setter method to update the radius
	public void setRadius(double radius) {
		this.radius = radius;
	}

	// Override the area() method to calculate the area of a circle (πr²)
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

	// Override the perimeter() method to calculate the circumference of a circle
	// (2πr)
	@Override
	public double perimeter() {
		return 2 * Math.PI * radius;
	}

	// Override toString() to provide a descriptive string representation of the
	// Circle
	@Override
	public String toString() {
		return super.toString() + ", Radius: " + radius;
	}
}
