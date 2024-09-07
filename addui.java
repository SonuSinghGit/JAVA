import java.util.Scanner;
public class addui 
{
    public static void main(String args[]) 
    {
        
        Scanner obj=new Scanner(System.in);
        System.out.print("enter first number: ");
        int a=obj.nextInt();
        System.out.println("enter second number: ");
        int b= obj.nextInt();
        int z=a+b;
        System.out.println("addition of the number is: "+z);
        System.out.println("program end succesfully");

    }
    
}
