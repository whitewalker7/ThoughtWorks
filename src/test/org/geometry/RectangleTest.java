package org.geometry;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class RectangleTest {
    Rectangle rectangle;

    @Before
    public void setup() {
        rectangle = new Rectangle(20, 10);

    }

    @Test
    public void shouldCalculateArea() {
        assertEquals(200.0, rectangle.Area());
    }


}
