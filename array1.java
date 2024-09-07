import java.util.Scanner;
public class array1 
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num[]=new int[10];
        System.out.println("enter 5 integer: ");
        for(int i=0;i<5;i++)
        {
            num[i]=obj.nextInt();
        }
        System.out.println("you entred following number: ");
        for(int i=0;i<5;i++)
        {
            System.out.println(num[i]);
            obj.close();
        }
    }
               
}
