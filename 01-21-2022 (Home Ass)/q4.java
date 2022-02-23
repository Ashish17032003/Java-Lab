//WAP to display the smallest no using 2 inputted no using if else.

import java.util.Scanner;
public class q4
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        System.out.print("Enter two numbers: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
      
        if( n1 < n2)
            System.out.println(n1 + " is the smaller number.");

        else if (n2 < n1)
            System.out.println(n2 + " is the smaller number.");

        else
            System.out.println("Both "+ n1 +"and"+ n2 + "are equal");

        sc.close();
    }
}
