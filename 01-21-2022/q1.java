// Write a simple java program to print your biodata which contains your Name, Roll No, Branch

import java.util.Scanner;
public class q1 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int roll;
      
        System.out.print("Enter Name: ");
        String name=sc.nextLine();
      
        System.out.print("Enter Roll No.: ");
        roll = sc.nextInt();
      
        System.out.print("Enter Branch: ");
        String branch = sc.nextLine();
      
        System.out.println("\n\tBIODATA\t");
        System.out.print("Name = " + name + "\nRoll No. = " + roll + "\nBranch = " + branch);
        
        sc.close();
    }
}
