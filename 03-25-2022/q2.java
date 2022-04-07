/*

Write a  java class which has a method called ProcessInput(). This method checks the number entered by the 
user. if the entered number is negative then throw an user defined exception called NegativeNumberException,
otherwise it displays the double value of the entered number.

*/

import java.util.*;

class testclass
{
    int ProcessInput( int n )
    {
        try
        {
            if( n < 0 ) 
            {
                throw new IllegalArgumentException("Negative Number Exception");
            }

            System.out.println((double)n);
        }

        catch( IllegalArgumentException ex1 )
        {
            System.out.println (ex1.getMessage() );
        }

        return 0;
    }
}

public class q2
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        testclass ob = new testclass();
        ob.ProcessInput(n);

        sc.close();

    }
}