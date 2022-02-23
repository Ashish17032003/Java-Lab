/*

Write a program in java using inheritance to show how to call the base class parameterized constructors 
from the derived class using super.

*/

class Sum 
{
    Sum(int i , int j) 
    {
        System.out.println("Sum in default constructor: " + (i + j));
    }
}

class Person extends Sum 
{
    static int i=6;
    static int j=9;

    Person() 
    {
        super(i,j);
        System.out.println("Sum in inherited class constructor: " + (i + j));
    }
}

public class q5 
{
    public static void main(String args[]) 
    {
        Person ob = new Person();
    }
}
