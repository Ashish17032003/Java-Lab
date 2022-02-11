//Write a program to calculate area according to user input, whether it is circle, square or triangle (Menu Driven).

import java.util.*;

public class q6 {
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Area of circle");
        System.out.println("2. Area of square");
        System.out.println("3. Area of rectangle");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius of Circle: ");
                double r = sc.nextDouble();
                double ca = (22 / 7.0) * r * r;
                System.out.println("Area of Circle = " + ca);
                break;

            case 2:
                System.out.print("Enter side of Square: ");
                double side = sc.nextDouble();
                double sa = side * side;
                System.out.println("Area of Square = " + sa);
                break;

            case 3:
                double b , h , ta;
                System.out.print("Enter Breadth of Triangle: ");
                b= sc.nextDouble();
                System.out.print("Enter height of Triangle: ");
                h = sc.nextDouble();
                ta = (b * h) / 2;
                System.out.println("Area of Triangle is = " + ta);
                break;

            default:
                System.out.println("Wrong choice!");
        }

        sc.close();
    }
}
