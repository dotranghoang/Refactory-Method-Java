import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCylinder {

    @Test
    @DisplayName("Testing Get Base Area")
    public void testBaseArea() {
        int radius = 2;
        double expected = Math.PI * radius * radius;

        double result = Cylinder.getBaseArea(radius);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing Get Perimeter")
    public void testPerimeter() {
        int radius = 2;
        double expected = 2 * Math.PI * radius;

        double result = Cylinder.getPerimeter(radius);
        assertEquals(expected, result);

    }

    @Test
    @DisplayName("Testing GetVolume")
    public void testVolume() {
        int radius = 2;
        int height = 2;
        double expected = Cylinder.getPerimeter(radius) * height + 2 * Cylinder.getBaseArea(radius);

        double result = Cylinder.getVolume(radius, height);
        assertEquals(expected, result);
    }
}
