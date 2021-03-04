import java.awt.*;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public abstract class Shape {
    /*
    - return the center of the shape
    - compute the areal of the shape
    - compute the circumference of the shape
    - indicate whether a point is inside the shape or not (e.g. the point could represent a mouse
        click)
    - compute the Euclidean distance to another shape (center to center)
     */
    /*
    links:
        - format numbers: http://tutorials.jenkov.com/java-internationalization/decimalformat.html
     */
    public abstract Point center() ;
    public abstract double area() ;
    public abstract double circumference() ;
    public abstract boolean pointInside(Point point) ;
    public double euclideanDistance(Shape that){
        //We use this formula d = sqrt( pow(that.center().x - this.center().x) +   pow(that.center().y - this.center().y))
        return sqrt( pow( (that.center().x - this.center().x), 2) +   pow( (that.center().y - this.center().y), 2) ) ;
    }
}
