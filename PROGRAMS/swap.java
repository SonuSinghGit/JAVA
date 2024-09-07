import java.util.Scanner;
public class swap 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a =: ");//10
        int a=obj.nextInt();
        System.out.println("enter b =: ");//20
        int b=obj.nextInt();
        a=a+b;//30
        b=a-b;//10
        a=a-b;
        System.out.println("a is : "+a);
        System.out.println("b is : "+b);
        
    }         
}
