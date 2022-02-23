//WAP to display number of odd and even numbers from 10 inputted numbers

import java.io.*;
import java.util.Scanner;

public class q2 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int even = 0, odd = 0;
        System.out.print("Enter 10 numbers: ");

        int n[] = new int[10];

        for( int i = 0 ; i < 10 ; i++)
            n[i] = sc.nextInt();

        for( int i = 0 ; i < 10 ; i++)
        {
            if(n[i] % 2 == 0)
            even++;
            else
            odd++;
        }

        System.out.print("the number of EVEN digits are "+even+ " and the number of ODD digits are "+odd);
        sc.close();
    }
}