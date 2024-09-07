import java.util.*;
public class fibonacci
{
    public static void main(String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);
        int n1 = 0, n2 = 1;
        System.out.print("Enter the number of terms: ");
        int n=sc.nextInt();   
        System.out.println("First " + n + " terms of fibonnaci series: ");
        for (int i = 1; i <= n; i++)
        {  
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            System.out.print(n1 + " ");
        }
    }
}