/*
Write a program in Java to define a class Number with appropriate data members and member functions to input n number of integers and swap the biggest and 
smallest elements. Use member functions read(), swap() and display().
*/

import java.util.*;

class Number 
{
    int n;
    int big;
    int b;
    int small;
    int s;
    int arr[];

    void read() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n no of integers : ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.print("Enter array : ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        sc.close();
    }

    void swap() 
    {
        small = 999;
        big = 0;
        for (int i = 0; i < n; i++) 
        {
            if (arr[i] < small) 
            {
                small = arr[i];
                s = i;
            }

            if (arr[i] > big) 
            {
                big = arr[i];
                b = i;
            }
        }

        int key;
        key = arr[s];
        arr[s] = arr[b];
        arr[b] = key;
    }

    void display() 
    {
        System.out.println("\n\nThe array is : ");
        for (int i = 0; i < n; i++)
            System.out.print(" " + arr[i]);
    }
}

public class q7 
{
    public static void main(String args[]) 
    {
        Number ob = new Number();
        ob.read();
        ob.display();
        ob.swap();
        ob.display();
    }
}
