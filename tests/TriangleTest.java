import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {
    Triangle t1 ;
    Triangle t2 ;
    Triangle t3 ;

    @BeforeEach
    void setup(){
        t1 = new Triangle(100,232,50,60, 150, 150) ;
        t2 = new Triangle(100, 125, 100, 35, 35, 250) ;
        t3 = new Triangle(60, 150, 20, 30, 100, 40) ;
    }

    @Test
    void center(){
        assertEquals(new Point(100,147), t1.center()) ;
        assertEquals(new Point(78,136), t2.center()) ;
        assertEquals(new Point(60,73), t3.center()) ;
    }

    @Test
    void circumference(){
        //We convert the circumference to an int so we don't have a failing test because of the number of digits after the decimal point
        assertEquals(455, (int)t2.circumference());
        assertEquals(324, (int)t3.circumference());
    }

    @Test
    void area(){
        assertEquals(2924, (int)t2.area());
        assertEquals(4600, (int)t3.area());
    }

}
