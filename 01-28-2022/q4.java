//Display all the perfect number between a range 

import java.util.Scanner;

public class q4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int i,j, n1,n2, Sum = 0;
        System.out.println("Enter the Range: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        for(j=n1 ; j <= n2 ; j++)
        {
            Sum=0;
            for (i = 1; i < j; i++) 
            {
                if (j % i == 0) 
                {
                    Sum = Sum + i;
                }
            }

            if (Sum == j) 
                System.out.print(j+ " ");
        }

        sc.close();
        
    }
}
