/*
Further define another public class Circle inside another package mypackage2. Class Circle have the 
following private member variables: a radius (double) and a centre (an instance of the previously 
defined Point class). Define suitable constructor(s) for the Circle class, and the 
following methods: a distance(Circle another) method that returns the distance from the centre of 
this instance to the centre of the given Circle instance (called another), 
and a checkWithin(Point p) method that can check whether the given 
point argument p is "within", "on", or "outside" this circle.
*/

/*
To compile java package
javac -d directory javafilename  // -d is used to specify the output directory
java mypackage2.Circle
*/ 

package mypackage2;
import mypackage1.*;

public class Circle 
{
    private double radius;
    Point center;
    
    public Circle(double x, double y, double radius)
    {
        center = new Point(x, y);
        this.radius = radius;
    }

    // distance from the centre of this instance to the centre of the given Circle instance
    public double distance( Circle c1) 
    {
        double d = this.center.distance(c1.center);
        return d;        
    }

    // to check whether the given point argument p is "within", "on", or "outside" this circle.
    public int checkWithin(Point p) 
    {
        int flag;
        double d = this.center.distance(p);
        if (d > this.radius)
        {
            flag = 0;
        } 
        else if (d ==  this.radius)
        {
            flag = 1;
        }
        else
        {
            flag = -1;
        }
        return flag;
    }
    
}
