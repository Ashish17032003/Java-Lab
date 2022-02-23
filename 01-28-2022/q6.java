//WAP to display the sum of the following series 1 + (2^2)/!2 + (3^3)/!3 + (4^4)/!4 + - - - - + (n^n)/!n

import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class q6
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int i , j , f = 1;
        double sum=0;
        System.out.print("Enter the value of n : ");

        int n = sc.nextInt();
        if(n>=1)
            sum=1;

        if(n>1)
        {
            
            for( i=2; i<=n; i++)
            {
                f = 1;

                for(j = 1; j <= i; j++) 
                {
                    f = f * j;
                }

                sum=sum + ((Math.pow(i,i))/f);
            }
        }
        
        System.out.print("Sum of the series: " + sum);
        sc.close();
    }
}