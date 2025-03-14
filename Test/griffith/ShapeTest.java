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
	void testRectangle() {
		fail("Not yet implemented");
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
