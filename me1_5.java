import java.util.Scanner;
public class me1_5
{  
    public static void main(String[] args)   
    {  
       int a, b, c, compare;   
       Scanner obj = new Scanner(System.in);  

       System.out.println("Enter the first number:");  
       a = obj.nextInt();  
       System.out.println("Enter the second number:");  
       b = obj.nextInt();  
       System.out.println("Enter the third number:");  
       c = obj.nextInt();  
       compare = a >b ? (a > c ? a : c) : (b > c ? b : c);  
       System.out.println("The largest number is: "+compare);  
    }  
}  
    

