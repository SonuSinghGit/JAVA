import java.util.Scanner;
public class me1Q8 
{
    public static void main(String[] args) 
    {
        int n,i,count=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the number: ");
        n=obj.nextInt();

        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println("given number is prime...!");
        }
        else
        {
            System.out.println("given number is not prime..!");
        }
    }   
}
