import java.awt.*;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Triangle extends Shape{
    private Point A ;
    private Point B ;
    private Point C ;
    private double a ; //length of side AB of the triangle
    private double b ; //length of side BC of the triangle
    private double c ; //length of side CA of the triangle

    public Triangle(int A_x, int A_y, int B_x, int B_y, int C_x, int C_y){
        A = new Point(A_x, A_y);
        B = new Point(B_x, B_y) ;
        C = new Point(C_x, C_y) ;
        a = sqrt( pow( B_x-A_x, 2) + pow( B_y-A_y, 2) ) ;
        b = sqrt( pow( C_x-B_x, 2) + pow( C_y-B_y, 2) ) ;
        c = sqrt( pow( A_x-C_x, 2) + pow( A_y-C_y, 2) ) ;

    }
    @Override
    public Point center() {
        int C_x = (int)((A.x + B.x + C.x)/3) ;
        int C_y = (int)((A.y + B.y + C.y)/3) ;
        return new Point(C_x,C_y) ;
    }

    @Override
    public double area() {
        //To calculate the triangles areas we use Heron's Formula
        double s = (a+b+c)/2 ;
        double area = sqrt(s*(s-a)*(s-b)*(s-c)) ;
        return area ;
    }

    @Override
    public double circumference() {
        return a+b+c;
    }

    @Override
    public boolean pointInside(Point point) {
        return false;
    }
}
