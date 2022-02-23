/*
Write a program in Java to define a class Number with appropriate data members and member functions to 
input n number of integers and swap the biggest and smallest elements. 
Use member functions read(), swap() and display().
*/

import java.util.*;

class Number 
{
    int n; // array size
    int biggest; // value of biggest
    int biggest_index; // index of biggest
    int smallest; // value of smallest
    int smallest_index; // index of smallest
    int arr[];

    void read() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        sc.close();
    }

    void swap() 
    {
        smallest = 999;
        biggest = 0;
        for (int i = 0; i < n; i++) 
        {
            if (arr[i] < smallest) 
            {
                smallest = arr[i];
                smallest_index = i;
            }

            if (arr[i] > biggest) 
            {
                biggest = arr[i];
                biggest_index = i;
            }
        }

        int temp_swap;
        temp_swap = arr[smallest_index];
        arr[smallest_index] = arr[biggest_index];
        arr[biggest_index] = temp_swap;
    }

    void display() 
    {
        System.out.print("\nThe array is : ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i]+" ");
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
