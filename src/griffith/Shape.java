package griffith;

public abstract class Shape {
	private String name;

	// Constructor
	public Shape(String name) {
		this.name = name;
	}

	// Getter for name
	public String getName() {
		return name;
	}

	// Setter for name
	public void setName(String name) {
		this.name = name;
	}

	// Abstract methods
	public abstract double area();

	public abstract double perimeter();

	// toString method
	@Override
	public String toString() {
		return "Shape: " + name;
	}
}
