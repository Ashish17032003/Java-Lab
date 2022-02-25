/*

Pass a list of float values as argument from the command line. Arrange them in ascending order 
if the last argument is even or descending order if the last argument is odd.

*/


public class test
{  
    public static void main(String args[])
    {  
        int s=args.length;
        float arr[]=new float[s];

        for(int i=0;i<s;i++)
        arr[i] = (Float.parseFloat(args[i]));

        if((arr[s-1]%2)==0)
        {
            for(int i=0;i<s-1;i++)
            {
                float min=arr[i];
                int index=i;
                for(int j=i+1;j<s;j++)
                {
                    if(arr[j]<min)
                    {
                        index=j;
                        min=arr[j];
                    }
                }
                arr[index]=arr[i];
                arr[i]=min;
            }
        }


        else
        {
        for(int i=0;i<s-1;i++)
            {
                float max=arr[i];
                int index=i;
                for(int j=i+1;j<s;j++)
                {
                    if(arr[j]>max)
                    {
                        index=j;
                        max=arr[j];
                    }
                }
                arr[index]=arr[i];
                arr[i]=max;
            } 
        }


        for(int i=0;i<s;i++)
        System.out.print(arr[i]+" ");

    }  
} 