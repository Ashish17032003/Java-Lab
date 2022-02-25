/*

Write a program in java to define a class Shape which has data member area and a member function showArea(). 
Derive two classes Circle and Rectangle from Shapeclass. 
Add appropriate data members and member functions to calculate and display the area of Circle and Rectangle.

*/


import java.util.*;
class Shape
{
    double area;
    void showArea()
    {
        System.out.println("Area: " + area);
    }
}

class Circle extends Shape
{
    Circle(int r)
    {
        area = 3.14 * Math.pow(r,2);
        showArea();
    }
}

class Rectangle extends Shape 
{
    Rectangle(int l, int b)
    {
        area = l * b;
        showArea();
    }
}


public class q3 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        int l, b, r;
        r = sc.nextInt();
        System.out.print("Enter the length and breadth : ");
        l = sc.nextInt();
        b = sc.nextInt();
        System.out.println("--- Area of Circle ---");
        Circle ob1 = new Circle(r);
        System.out.println("--- Area of Reactangle ---");
        Rectangle ob2 = new Rectangle(l, b);
        sc.close();
    }
}