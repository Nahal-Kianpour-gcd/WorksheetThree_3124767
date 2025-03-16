/* Student name:Nahal Kianpour Lirharani
 * Student number:3124767
 */
package griffith;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class ShapeTest {

	private static final double EPSILON = 0.0; // Exact match for floating points

	// UNIT TESTS (Initially failing)

	@Test
	void testCircle() {
		Circle circle = new Circle("Circle", 3.5);

		assertEquals("Circle", circle.getName());
		assertEquals(3.5, circle.getRadius(), EPSILON);

		assertEquals(Math.PI * 3.5 * 3.5, circle.area(), EPSILON); // πr²
		assertEquals(2 * Math.PI * 3.5, circle.perimeter(), EPSILON); // 2πr

		assertEquals("Shape: Circle, Radius: 3.5", circle.toString());
	}

	@Test
	void testRhombus() {
		Rhombus rhombus = new Rhombus("Rhombus", 6.0, 8.0);

		assertEquals("Rhombus", rhombus.getName());
		assertEquals(6.0, rhombus.getDiagonal1(), EPSILON);
		assertEquals(8.0, rhombus.getDiagonal2(), EPSILON);

		assertEquals((6.0 * 8.0) / 2, rhombus.area(), EPSILON); // (d1 * d2) / 2
		assertEquals(2 * Math.sqrt(6.0 * 6.0 + 8.0 * 8.0), rhombus.perimeter(), EPSILON); // 2√(d1² + d2²)

		assertEquals("Shape: Rhombus, Diagonal1: 6.0, Diagonal2: 8.0", rhombus.toString());
	}

	@Test
	void testRightAngledTriangle() {
		RightAngledTriangle triangle = new RightAngledTriangle("RightAngledTriangle", 3.0, 4.0);

		assertEquals("RightAngledTriangle", triangle.getName());
		assertEquals(3.0, triangle.getBase(), EPSILON);
		assertEquals(4.0, triangle.getHeight(), EPSILON);

		assertEquals((3.0 * 4.0) / 2, triangle.area(), EPSILON); // (base * height) / 2
		assertEquals(3.0 + 4.0 + Math.sqrt(3.0 * 3.0 + 4.0 * 4.0), triangle.perimeter(), EPSILON); // a + b + hypotenuse

		assertEquals("Shape: RightAngledTriangle, Base: 3.0, Height: 4.0", triangle.toString());
	}

	@Test
	void testShapesIntegration() {
		ArrayList<Shape> shapes = new ArrayList<>();

		// Adding 2 instances of each shape to the list
		shapes.add(new Circle("Circle1", 3.5));
		shapes.add(new Circle("Circle2", 2.0));

		shapes.add(new Rhombus("Rhombus1", 6.0, 8.0));
		shapes.add(new Rhombus("Rhombus2", 5.0, 7.0));

		shapes.add(new RightAngledTriangle("Triangle1", 3.0, 4.0));
		shapes.add(new RightAngledTriangle("Triangle2", 6.0, 8.0));

		// Loop through each shape and validate area & perimeter calculations
		for (Shape shape : shapes) {
			assertTrue(shape.area() > 0, "Area should be greater than zero for " + shape.getName());
			assertTrue(shape.perimeter() > 0, "Perimeter should be greater than zero for " + shape.getName());
		}
	}

}
