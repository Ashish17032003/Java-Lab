//WAP in java to check whether a number is prime or composite

import java.util.Scanner;

public class q3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int count = 0;
        if (n == 1)
            System.out.println("Composite Number");
        else if (n == 2)
            System.out.println("Prime Number");

        else 
        {
            for (int i=2; i<=n; i++) 
            {
                if (n % i == 0)
                    count++;
                break;
            }
            if (count != 0)
                System.out.println("Composite Number");
            else
                System.out.println("Prime Number");

        }

        sc.close();

    }
}
