/*

Define a public class Point representing a point in 2-D coordinate system inside a
package mypackage1. Also define suitable constructor(s) for the class and a list of
overloaded methods - distance(), distance(double x, double y), distance(Point another)
that can find Euclidean distances of this point from the origin, from another point
having coordinate (x, y), and from any other given Point variable another, respectively.

Further define another public class Circle inside another package mypackage2. Class
Circle have the following private member variables: a radius (double) and a centre (an
instance of the previously defined Point class). Define suitable constructor(s) for the
Circle class, and the following methods: a distance(Circle another) method that returns
the distance from the centre of this instance to the centre of the given Circle instance
(called another), and a checkWithin(Point p) method that can check whether the given
point argument p is "within", "on", or "outside" this circle.

Write Java Program(s) to implement above classes and demonstrate their use.

*/

import mypackage2.mypackage1.Point;
import mypackage2.Circle;
import java.util.Scanner;

public class q1
{
    public static void main(String[] args) 
    {
        double cord1, cord2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cartesian coordinates for point 1(x,y) : ");
        cord1 = sc.nextDouble();
        cord2 = sc.nextDouble();
        Point p1 = new Point( cord1, cord2 );

        System.out.print("\nEnter the cartesian coordinates for point 2(x,y) : ");
        cord1 = sc.nextDouble();
        cord2 = sc.nextDouble();
        Point p2 = new Point( cord1, cord2 );

        double d1 = p1.distance();
        System.out.print("\nEucledian Distance of point 1 from Origin : " + d1);

        System.out.print("\nEnter the cartesian coordinates of a point to find the distance from point 1(x,y) :");
        cord1 = sc.nextDouble();
        cord2 = sc.nextDouble();

        double d2 = p1.distance( cord1, cord2 );
        System.out.print("\nEuclidean Distance of point 1 from the given point : " + d2 );

        double d3 = p1.distance( p2 );
        System.out.print("\nEuclidean Distance of point 1 from point 2 : " + d3 );


        double radius;

        System.out.print("\nEnter the cartesian coordinates and radius respectively for circle 1(x,y,r) : ");
        cord1 = sc.nextDouble();
        cord2 = sc.nextDouble();
        radius = sc.nextDouble();
        Circle c1 = new Circle(cord1, cord2, radius);

        System.out.print("\nEnter the cartesian coordinates and radius respectively for circle 2(x,y,r) : ");
        cord1 = sc.nextDouble();
        cord2 = sc.nextDouble();
        radius = sc.nextDouble();
        Circle c2 = new Circle(cord1, cord2, radius);

        double d4 = c1.distance( c2 );
        System.out.println("Distance between circles : " + d4);

        int flag = c1.checkWithin( p1 );
        if (flag == 0)
        {
            System.out.println("Outside");

        }
        else if (flag == 1)
        {
            System.out.println("ON");
        }
        else 
        {
            System.out.println("Inside");
        }

        sc.close();

    }

}