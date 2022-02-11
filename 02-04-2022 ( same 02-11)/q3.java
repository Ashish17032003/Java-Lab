
// Write a program which will overload the area () method and display the area of a circle, triangle and square as per user choice and user entered dimensions.


import java.util.*;
public class q3 
{

    static double area(double r)
    {
        return (3.14*r*r);
    }

    static double area(int r)
    {
        return (r*r);
    }

    static double area(double b,double h)
    {
        return (0.5*b*h);
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("---- Press 1 to calculate the area of circle, 2 to calculate area of a square and 3 to calculate the area of a triangle ----");
        int ch=in.nextInt();
        double r,b;
        switch(ch)
        {
            case 1:
            System.out.println("Enter the radius: ");
            r=in.nextDouble();
            System.out.println("The area of the circle is: "+ area(r));
            break;

            case 2:
            System.out.println("Enter the side: ");
            int k=in.nextInt();
            System.out.println("The area of the circle is: "+ area(k));
            break;

            case 3:
            System.out.println("Enter the height and base: ");
            r=in.nextDouble();
            b=in.nextDouble();
            System.out.println("The area of the circle is: "+ area(r,b));
            break;

            default:
            System.out.println("Wrong Choice");
            break;
        }
        in.close();
    }
    
}
