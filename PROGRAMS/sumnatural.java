import java.util.Scanner;
public class sumnatural {

    
    public static void main(String[] args) {
        int i,n ,sum=0;
        Scanner obj= new Scanner(System.in);
        System.out.println("enter the number:");
        n=obj.nextInt();
        for( i=1;i<=n; i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
        
    }
    
}
