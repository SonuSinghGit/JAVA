import java.util.Scanner;
public class array2
{
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("enter the number of element: ");
        int n= obj.nextInt();
        int num[]=new int[n];
        System.out.println("enter "+n+" integer number:  ");
        for(int i=0;i<n;i++)
        {
            num[i]=obj.nextInt();
        }
        System.out.println("you entered following number: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(num[i]);
        }
    }            
}

    

