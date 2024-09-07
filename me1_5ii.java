import java.util.Scanner;

public class me1_5ii {
    public static void main(String[] args) {
        int a,b,c;
        Scanner obj= new Scanner(System.in);
        System.out.println("enter three number: ");
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();

        if(a>b && a>c)
        {
            System.out.println("A is the greatest number: ");
        }
       else if(b>c && b>a)
        {
        System.out.println("B is the greatest number: ");
        }
        else
        {
            System.out.println("c is the greatest number: ");
        }
    }
    
}
