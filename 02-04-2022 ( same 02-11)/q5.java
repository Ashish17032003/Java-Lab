/*
Write a program in java to input and display the details of n number of students having roll, 
name and cgpa as data members. Also display the name of the student having the lowest cgpa.
*/

import java.util.Scanner;

class Student
{
    int roll;
    String name;
    double cgpa;
    Scanner sc = new Scanner(System.in);

    public void input()
    {
        System.out.print("Enter the Roll Number: ");
        roll=sc.nextInt();
        System.out.print("Enter the CGPA: ");
        cgpa=sc.nextDouble();
        System.out.print("Enter the Name: ");
        name=sc.next();
    }

    public void display()
    {
        System.out.println("Roll Number: "+roll);
        System.out.println("CGPA: "+cgpa);
        System.out.println("Name: "+name);
    }
}

public class q5
{ 
       public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n=sc.nextInt();

        double low=10;
        int index=0;

        Student obj[] = new Student[n];

        for(int i=0; i<n; i++)
        {
            obj[i]= new Student();
            System.out.println("---- Enter the Student "+ (i + 1) +" details ----");
            obj[i].input();
        }

        System.out.print("\n----- StudentList -----");

        for(int i=0; i<n; i++)
        {
            System.out.println("\n----Student " + (i + 1) + "----");
            obj[i].display();
        }

        for (int i=0; i<n; i++) 
        {
            if(obj[i].cgpa < low)
            {
                low = obj[i].cgpa;
                index = i;
            }
        }   // calculating the lowest cgpa and it's index

        System.out.println("\n----Student with lowest C.G.P.A.----");
        obj[index].display();

        sc.close();
    }
}
