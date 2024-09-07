import java.util.Scanner;
class Factorial
{
    int num, f;

    Factorial()
    {
        f = 1;
    }

    Factorial(int n)
    {
        num = n;
    }

    public int getFactorial()
    {
        for(int i = 1; i <= num; i++)
        {
            f = f * i;
        }   
        System.out.println("Factorial= " + f);
        return f;
    }

    public static void main(int m)
    {     
        Factorial obj = new Factorial();
        obj = new Factorial(m);
        obj.getFactorial();
    }
}




// public class me2q2
// {
//     public static void main(String[] args) {
//         Scanner obj=new Scanner(System.in);
//         int fact=1;
//         System.out.println("enter the number: ");
//         int n=obj.nextInt();
//         for(int i=1;i<n;i++)
//         {
//             fact+=fact*i;
//         }
//         System.out.println("factorial of the number is:"+fact);  
//     }
// }
