import java.awt.*;

import static java.lang.Math.*;

public class Circle extends Shape {
    private Point center;
    private double radius;

    public Circle(int c_x, int c_y, double radius) {
        center = new Point(c_x, c_y);
        this.radius = radius;
    }

    @Override
    public Point center() {
        return center;
    }

    @Override
    public double area() {
        return (PI * pow(radius, 2));
    }

    @Override
    public double circumference() {
        return (2 * PI * radius);
    }

    @Override
    public boolean pointInside(Point p) {
        boolean inside = false;
        //Pythagore: https://stackoverflow.com/questions/481144/equation-for-testing-if-a-point-is-inside-a-circle
        if ((pow((p.x - center.x), 2) + pow((p.y - center.y), 2)) <= pow(radius, 2))
            inside = true;

        return inside;
    }

}
