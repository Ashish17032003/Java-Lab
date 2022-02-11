//Write a java proogram to find addition , subtraction and multiplication of two numbers


import java.util.Scanner;
public class twonum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1,num2,c;
        System.out.print("Enter two numbers : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt(); 
        System.out.println("\n\n1. ADDITION");
        System.out.println("2. SUBSTRACTION");
        System.out.println("3. MULTIPLICATION");
        System.out.println("----Enter your choice----");
        c = sc.nextInt();
        switch(c)
        {
            case 1: 
                System.out.println("Addition of "+num1+" and "+num2+" is = " +(num1+num2));
                break;
            case 2:
                System.out.println("Substraction of " + num1 + " and " + num2 + " is = " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplication of " + num1 + " and " + num2 + " is = " + (num1*num2));

                break;
            default:
                System.out.println("Invalid");
        }

        sc.close();
    }
}
