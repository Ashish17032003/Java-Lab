/*
Write a program to calculate area according to user input, whether it is circle, 
square or triangle (Menu Driven).
*/

import java.util.*;

public class q6 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Area of circle");
        System.out.println("2. Area of square");
        System.out.println("3. Area of rectangle");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) 
        {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double r = sc.nextDouble();
                double ca = (22 / 7.0) * r * r;
                System.out.println("Area of the circle = " + ca);
                break;

            case 2:
                System.out.print("Enter the side of the square: ");
                double side = sc.nextDouble();
                double sa = side * side;
                System.out.println("Area of the square = " + sa);
                break;

            case 3:
                double b , h , ta;
                System.out.print("Enter the breadth of the triangle: ");
                b= sc.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                h = sc.nextDouble();
                ta = (b * h) / 2;
                System.out.println("Area of the triangle is = " + ta);
                break;

            default:
                System.out.println("Invalid Input!");
        }

        sc.close();
    }
}
