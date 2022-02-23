/*
Write a program in Java to define a class Rectangle having data member: length and breadth; to calculate the area and perimeter of the rectangle.
Use member functions to read, calculate and display.
 */

import java.util.Scanner;

class Rectangle
{
    double length,breadth,area,perimeter;

    public void getvalue()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length and breadth: ");
        length=sc.nextInt();
        breadth=sc.nextInt();
        sc.close();
    }

    public double Area()
    {
        return length*breadth;
    }

    public double Perimeter()
    {
        return 2*(length+breadth);
    }

    public void display(double area, double perimeter)
    {
        System.out.println("Area: "+area);
        System.out.print("Perimeter: "+perimeter);
    }
}


public class q4
{
    public static void main(String []args)
    {
        Rectangle obj = new Rectangle();
        double area,perimeter;
        obj.getvalue();

        area = obj.Area();
        perimeter = obj.Perimeter();

        obj.display(area,perimeter);
    }
}
