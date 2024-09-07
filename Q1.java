import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) 
    {
        int a,b;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter first number:");
        a=obj.nextInt();
        System.out.println("enter second number:");
        b=obj.nextInt();
        if(a>b)
        {
            System.out.println("A is greater..!");
        }
        else
        {
            System.out.println("B is greater..!");
        }
    } 
}
