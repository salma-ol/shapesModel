import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RectangleTest {
    Rectangle r1 ;
    Rectangle r2 ;
    Rectangle r3 ;

    @BeforeEach
    void setup(){
        r1 = new Rectangle(20,100,100,50) ;
        r2 = new Rectangle(180, 80, 250, 60) ;
        r3 = new Rectangle(0, 50, 50, 0) ;
    }

    @Test
    void center(){
        //We convert the are to an int so we don't have a failing test because of the number of digits after the decimal point
        assertEquals(r1.center(), new Point(60,75)) ;
        assertEquals(r2.center(), new Point(215,70)) ;
        assertEquals(r3.center(), new Point(25,25)) ;
    }

    @Test
    void area(){
        assertEquals((int)r1.area(), 4000);
        assertEquals((int)r2.area(), 1400);
        assertEquals((int)r3.area(), 2500);
    }

    @Test
    void circumference(){
        assertEquals((int)r1.circumference(), 260);
        assertEquals((int)r2.circumference(), 180);
        assertEquals((int)r3.circumference(), 200);
    }

    @Test
    void pointInside(){
        assertEquals(r1.pointInside(new Point(80,60)), true);
        assertEquals(r1.pointInside(new Point(100,100)), true);
        assertEquals(r1.pointInside(new Point(50,150)), false);
        assertEquals(r1.pointInside(new Point(170,50)), false);
        assertEquals(r1.pointInside(new Point(20,80)), true);
    }

    @Test
    void euclidianDistance(){
        assertEquals((int)r1.euclideanDistance(r2), 155) ;
        assertEquals((int)r2.euclideanDistance(r3), 195) ;
    }



}
