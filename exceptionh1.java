import java.util.*;
public class exceptionh1 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int a=10;
        System.out.print("enter the value of b:");
        int b=obj.nextInt();
        try
        {
            int result=a/(int)b;
            System.out.println(result);
        }
        catch(Exception e)
        {
            System.out.println("something went wrong while entrering the value of b:");
        }
    
        System.out.println();

        System.out.println("end of the program");
    }
    
    
    
}
