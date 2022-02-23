/*
A plastic manufacturer sells plastic in different shapes like 2D sheet and 3D box. 
The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic ft.  
Implement it in Java to calculate the cost of plastic as per the dimensions given by the user 
where 3D inherits from 2D
*/

import java.util.*;

class sheet_2D
{
    int sheet=40;

    sheet_2D(int l , int b)
    {
        int plastic = sheet * l * b; 
        System.out.println("\nCost of the sheet is: Rs " + plastic);
    }
}


class box_3D extends sheet_2D
{
    int box=60;
    
    box_3D(int l, int b, int h) 
    {
        super(l,b);
        int plastic = box * l * b * h;
        System.out.println("\nCost of the box is: Rs " + plastic);
    }
}

public class q1 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dimensions (l,b,h) : ");
        int l , b , h ;
        l = sc.nextInt();
        b = sc.nextInt();
        h = sc.nextInt();
        box_3D ob = new box_3D(l, b, h);
        sc.close();
    }
}
