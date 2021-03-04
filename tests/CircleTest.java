import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.awt.*;

public class CircleTest {
    Circle c1;
    Circle c2;
    Circle c3;

    @BeforeEach
    void setup() {
        c1 = new Circle(50, 100, 20);
        c2 = new Circle(20, 250, 5.5);
        c3 = new Circle(121, 252, 21.2);
    }

    @Test
    void center() {
        assertEquals(c1.center(), new Point(50, 100));
        assertEquals(c2.center(), new Point(20, 250));
        assertEquals(c3.center(), new Point(121, 252));
    }

    @Test
    void area() {
        //We convert the area to an int so we don't have a failing test because of the number of digits after the decimal point
        assertEquals((int)c1.area(), 1256);
        assertEquals((int)c2.area(), 95);
        assertEquals((int)c3.area(), 1411);
    }

    @Test
    void circumference() {
        assertEquals((int)c1.circumference(), 125);
        assertEquals((int)c2.circumference(), 34);
        assertEquals((int)c3.circumference(), 133);
    }

    @Test
    void pointInside() {
        assertEquals(true, c1.pointInside(new Point(50, 120))); //To verify
        assertEquals(c1.pointInside(new Point(50, 80)), true);
        assertEquals(c1.pointInside(new Point(40, 95)), true);
        assertEquals(c1.pointInside(new Point(70, 100)), true);
        assertEquals(c1.pointInside(new Point(200, 200)), false);
    }

    @Test
    void euclidianDistance(){
        assertEquals((int)c1.euclideanDistance(c2), 152) ;
        assertEquals((int)c1.euclideanDistance(c3), 167) ;
    }

}
