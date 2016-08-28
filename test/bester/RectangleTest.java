package bester;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class RectangleTest {
    @Test
    public void areaShouldBeEqualToLengthyMultipliedByBreadth() throws Exception {
        assertEquals(6.0, new Rectangle(2, 3).area());
        assertEquals(0.0, new Rectangle(0, 1).area());
        assertEquals(3.75, new Rectangle(1.5, 2.5).area());
    }

    @Test
    public void shouldReturnRectangleWithLargestArea() throws Exception {
        Rectangle rectangle1 = new Rectangle(2,3);
        Rectangle rectangle2 = new Rectangle(3,3);

        assertTrue(rectangle2.betterThan(rectangle1));
    }
}
