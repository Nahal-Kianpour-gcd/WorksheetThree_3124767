/* Student name:Nahal Kianpour Lirharani
 * Student number:3124767
 */
package griffith;

// Subclass RightAngledTriangle, inherits from Shape
class RightAngledTriangle extends Shape {
	private double base; // Base of the right-angled triangle
	private double height; // Height of the right-angled triangle

	// Constructor to initialize RightAngledTriangle with name, base, and height
	public RightAngledTriangle(String name, double base, double height) {
		super(name); // Call the constructor of the parent class (Shape)
		this.base = base;
		this.height = height;
	}

	// Getter method for the base
	public double getBase() {
		return base;
	}

	// Setter method for the base
	public void setBase(double base) {
		this.base = base;
	}

	// Getter method for the height
	public double getHeight() {
		return height;
	}

	// Setter method for the height
	public void setHeight(double height) {
		this.height = height;
	}

	// Override the area() method to calculate the area of a right-angled triangle
	// (1/2 * base * height)
	@Override
	public double area() {
		return (base * height) / 2;
	}

	// Override the perimeter() method to calculate the perimeter of a right-angled
	// triangle
	// Formula: a + b + hypotenuse, where hypotenuse = sqrt(base² + height²)
	@Override
	public double perimeter() {
		double hypotenuse = Math.sqrt(base * base + height * height);
		return base + height + hypotenuse;
	}

	// Override toString() to provide a descriptive string representation of the
	// RightAngledTriangle
	@Override
	public String toString() {
		return super.toString() + ", Base: " + base + ", Height: " + height;
	}
}
