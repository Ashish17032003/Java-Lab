/*
Write a program in java to input and display the details of n number of students having roll, name and cgpa as data members. Also display the name of the 
student having the lowest cgpa.
*/

import java.util.Scanner;

class Student
{
    int roll;
    String name;
    int cgpa;
    Scanner sc = new Scanner(System.in);

    public void input()
    {
        System.out.print("Enter the Roll Number:");
        roll=sc.nextInt();
        System.out.print("\nEnter the CGPA:");
        cgpa=sc.nextInt();
        System.out.print("\nEnter the name:");
        name=sc.next();
    }

    public void output()
    {
        System.out.println("Roll Number: "+roll);
        System.out.println("CGPA: "+cgpa);
        System.out.println("Name: "+name);
    }
}

public class q5
{
    static void low_gpa(Student s[],int n)
    {
        Student low = s[0];

        for(int i=0;i<n;i++)
        {
            if(s[i].cgpa<low.cgpa)
            {
                low.cgpa=s[i].cgpa;
            }
        }

        System.out.print("\nStudent with lowest CGPA:\n");
        low.output();
    }
  
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n=sc.nextInt();
        Student obj[] = new Student[n];

        for(int i=0; i<n; i++)
        {
            obj[i]= new Student();
            obj[i].input();
        }

        System.out.print("\nList-");

        for(int i=0;i<n;i++)
        {
            obj[i].output();
        }

        sc.close();
        low_gpa(obj,n);
    }
}
