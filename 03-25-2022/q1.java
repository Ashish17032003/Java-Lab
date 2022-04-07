/*
WAP in java, pass 2 number using command line arguments and display the division of 2 numbers.
handel all possible exceptions.
*/


public class q1 
{
    public static void main(String[] args) 
    {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        float res;

        try
        {
            res = n1 / n2;
            System.out.println("Result : "+ res);

        }

        catch(ArithmeticException ex1)
        {
            System.out.println("Arithmetic Exception");
        }

        catch(NumberFormatException ex2)
        {
            System.out.println("NumberFormat Exception");
        }
        
        System.out.println("Test message");
    }
    
}
