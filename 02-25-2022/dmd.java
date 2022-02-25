class one
{
	int x=10; //data member
	public void great()
	{
	System.out.println("Welcome"); 
	}

	public void name()
	{
	System.out.println("I am in One"); 
	}
}


class two extends one //IS-A
{
	int x=20;
	public void display()
	{
	System.out.println("Hello"); 
	}
	public void name()  //override
	{
	System.out.println("I am in Two"); 
	}
}


public class dmd 
{
    public static void main(String args[])
    {
    //one obj=new one();
    //obj.name();  //works
    //obj.great();
    //two obj2=new two();
    //obj2.great();
    //obj2.display();

        one obj2=new two(); //allowed
        obj2.name();
        System.out.println(obj2.x);
    }
}
