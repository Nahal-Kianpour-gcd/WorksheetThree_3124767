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
	void testTriangle() {
		fail("Not yet implemented");
	}

	// INTEGRATION TEST (Initially failing)
	@Test
	void testShapesIntegration() {
		fail("Not yet implemented");
	}
}
