//WAP to input a no and check whether it is -ve or +ve.

import java.util.Scanner;
public class q1 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int n1;
        System.out.print("Enter a number: ");
        n1 = sc.nextInt();
        if( n1>0)
            System.out.println("The number you entered is positive");

        else if (n1<0)
            System.out.println("The number you entered is negative");

        else
            System.out.println("The number is neither positive nor negative");

        sc.close();
    }
}
