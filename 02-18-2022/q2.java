/*

Illustrate the execution of constructors in multi-level inheritance with three 
Java classes – plate(length, width), box(length, width, height), wood box(length, width, height, thick)

*/


class plate
{
    int length=4;
    int width=9;
    plate()
    {
        System.out.println("\nThis is constructor of class PLATE");
        int sa = length*width;
        System.out.println("Surface Area of plate: " + sa);
    }
}

class box extends plate 
{
    int height=5;
    box()
    {
        System.out.println("\nThis is constructor of class BOX");
        int sa = 2*length*width + 2*length*height + 2*width*height;
        System.out.println("Surface Area of box: " + sa);
    }
}

class wood_box extends box 
{
    int thick=20;
    wood_box()
    {
        System.out.println("\nThis is constructor of class WOOD BOX");
        int sa  = 2*(length*width + length*thick + width*thick);
        System.out.println("Surface Area of Wooden box: " + sa);
    }
}

public class q2 {
    public static void main(String args[])
    {
        wood_box ob = new wood_box();   
    }
}