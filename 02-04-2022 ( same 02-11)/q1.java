/*

Write a class file – box with three data members(length, width, height) and a method volume().
Also implement the application class Demo where an object of the box class is created 
with user entered dimensions and volume is printed.

*/

import java.util.*;
class box 
{
    double length , breadth , height ;
    double volume(double l, double b, double h)
    {
        return (l * b * h);
    }
}

public class q1 // demo class 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double l , b , h , vol;
        System.out.println("\n--Calculating Volume of box--");
        System.out.print("Enter the value of Length, Breadth, height: ");
        l = sc.nextDouble();
        b = sc.nextDouble();
        h = sc.nextDouble();

        box ob=new box();
        
        vol = ob.volume(l ,b ,h);
        System.out.println("Volume of the box : " + vol);
        sc.close();
    }
}
