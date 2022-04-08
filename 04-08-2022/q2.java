/*
Write a Java Program to create three user defined exceptions named HrsException,
MinException, and SecException. Create a class Time that contains data members
hours, minutes, seconds and throw the user defined exceptions if hours > 24 OR hours < 0, 
minutes > 60 OR minutes < 0, seconds > 60 OR seconds < 0. Then demo class using
suitable try…catch block to catch those exceptions in your program.
*/


import java.util.Scanner;

class HrsException extends Exception 
{
    HrsException(String s) 
    {
        super(s);  // passing message to base class constructor 
    }
}

class MinException extends Exception 
{
    MinException(String s) 
    {
        super(s);
    }
}

class SecException extends Exception 
{
    SecException(String s) 
    {
        super(s);
    }
}

class Time 
{
    int hours, minutes, seconds;

    Time(int hours, int minutes, int seconds) 
    {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    void display() throws HrsException, MinException, SecException 
    {
        // if-else for hours
        if (hours < 0 || hours > 24)
            throw new HrsException("\nHrs value is either less than 0 or greater than 24");

        else
            System.out.print( hours + " hr ");

        // if-else for minutes
        if (minutes < 0 || minutes > 60)
            throw new MinException("\nMin value is either less than 0 or greater than 60");

        else
            System.out.print(minutes + " minutes ");

        // if-else for seconds
        if (seconds < 0 || seconds > 60)
            throw new SecException("\nSec value is either less than 0 or greater than 60");

        else
            System.out.print(seconds + " seconds");
    }
}


class Demo
{
    void check(int hours, int minutes, int seconds)
    {
        Time mytime = new Time(hours, minutes, seconds);

        try 
        {
            System.out.print("\nThe Time is : ");
            mytime.display();
        } 
        
        catch (HrsException e) 
        {
            System.out.println(e);
        } 
        
        catch (MinException e) 
        {
            System.out.println(e);
        } 
        
        catch (SecException e) 
        {
            System.out.println(e);
        }
    }

}


public class q2 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        //Taking inpput for all the values
        System.out.print("Enter the hours value : ");
        int hours = sc.nextInt();

        System.out.print("Enter the minutes value : ");
        int minutes = sc.nextInt();

        System.out.print("Enter the seconds value : ");
        int seconds = sc.nextInt();
        sc.close();

        Demo d = new Demo();

        d.check(hours,minutes,seconds);
    }
}