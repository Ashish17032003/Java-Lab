//WAP to display the biggest no from 2 inputted no using conditional operator.

import java.util.Scanner;

class q3
{
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);  
    int n1,n2, max;
    n1=sc.nextInt();
    n2=sc.nextInt();
  
    max = (n1 > n2) ? n1 : n2;
    System.out.println("Largest number between " + n1 + " and " + n2 + " is " + max + ". " );
}
}
 
