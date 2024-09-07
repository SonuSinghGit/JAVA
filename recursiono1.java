import  java.util.*;
public class recursiono1 
{
    public static int factorial(int n)
    {
       if(n==0||n==1)
       {
        return 1;
       }
       else
       {
        return n*factorial(n-1);
       }
    }
    public static void main(String[] args) 
    {
        Scanner  obj  =new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=obj.nextInt();
        int result=factorial(n);
        System.out.println("the factorila of the given number is: "+result);
    }
    
}

