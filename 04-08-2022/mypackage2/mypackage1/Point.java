/*
Define a public class Point representing a point in 2-D coordinate system inside a
package mypackage1. Also define suitable constructor(s) for the class and a list of
overloaded methods - distance(), distance(double x, double y), distance(Point another)
that can find Euclidean distances of this point from the origin, from another point
having coordinate (x, y), and from any other given Point variable another, respectively.
*/ 

/*
To compile java package
javac -d directory javafilename  // -d is used to specify the output directory
java mypackage1.Point
*/

package mypackage2.mypackage1;
import java.lang.Math;

public class Point 
{
    double x,y,euc_distance;

    public Point(double x, double y) //public constructor for packages
    {
        this.x = x; 
        this.y = y;
    }

    //methods 

    public double distance()  // from origin
    {
        euc_distance = Math.sqrt( x*x + y*y );
        return euc_distance;
    }

    public double distance( double x, double y) // from another point having coordinate (x,y)
    {
        euc_distance = Math.sqrt( (this.x - x)*(this.x - x) + (this.y - y)*(this.y - y) );
        return euc_distance;
    }

    public double distance( Point another) 
    {
        euc_distance = Math.sqrt( (this.x - another.x)*(this.x - another.x) + (this.y - another.y)*(this.y - another.y) );
        return euc_distance;
    }    
    
}