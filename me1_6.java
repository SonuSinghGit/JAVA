import java.util.Scanner;
 
public class me1_6 {
 
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = obj.nextInt();
        if(n>=0)
        {
          System.out.println(Math.sqrt(n));
        }
        else if(n<0)
        { 
         int y=n*-1;
         System.out.println((int)Math.sqrt(y));

        }
    }
}