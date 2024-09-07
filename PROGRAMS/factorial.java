import java.util.Scanner;

class factorial {
    public static void main(String args[]) 
    {
        Scanner obj=new Scanner(System.in);
        int i,n, fact = 1;
        System.out.println("entre the number:");
        n=obj.nextInt();
        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n+ " is: " + fact);
    }
}