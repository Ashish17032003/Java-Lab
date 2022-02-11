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
        System.out.println("Enter the length and breadth:");
        Scanner s=new Scanner(System.in);
        length=s.nextInt();
        breadth=s.nextInt();
        s.close();
    }

    public double Area()
    {
        area=length*breadth;
        return area;
    }

    public double Perimeter()
    {
        perimeter=2*(length+breadth);
        return perimeter;
    }

    public void display()
    {
        System.out.println("Area:"+area);
        System.out.print("Perimeter:"+perimeter);
    }
}


public class q4
{
    public static void main(String []args)
    {
    Rectangle obj = new Rectangle();
    obj.getvalue();
    obj.Area();
    obj.Perimeter();
    obj.display();
    }
}
