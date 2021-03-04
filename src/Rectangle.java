import java.awt.*;

public class Rectangle extends Shape{
    /*Rectangle is represented by two points, one at the top left(tl) and the second at the bottom right (br)*/
    private Point tl ;
    private Point br ;
    private int width ;
    private int length ;

    public Rectangle(int tl_x, int tl_y, int br_x, int br_y){
        tl = new Point(tl_x, tl_y) ;
        br = new Point(br_x, br_y) ;
        width = tl_y - br_y ;
        length = br_x - tl_x ;
    }
    @Override
    public Point center() {
        int x = length/2 + tl.x ;
        int y = width/2 + br.y ;
        return new Point(x,y) ;
    }

    @Override
    public double area() {
        return width*length ;
    }

    @Override
    public double circumference() {
        return(width+length)*2 ;
    }

    @Override
    public boolean pointInside(Point p) {
        //If it is on the contour of the shape, the point is considered inside the shape
        boolean inside = false ;
        if( (( p.x <= br.x)&&(p.x >= tl.x)) && ((p.y <= tl.y)&&(p.y >= br.y)) )
            inside = true ;

        return inside;
    }

}
