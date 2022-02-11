//Write a program to overload subtract method with various parameters in a class in Java

public class q2 {

    public int subtract(int x, int y)
    {
        return (x - y);
    }
  
    public double subtract(double x, double y)
    {
        return (x - y);
    }

    public double subtract(float x, float y)
    {
        return (x - y);
    }
    public static void main(String args[])
    {
        q2 s = new q2();
        System.out.println(s.subtract(22,98));
        System.out.println(s.subtract(9.2,5.24));
        System.out.println(s.subtract(89.5,60));
    }
    
}
