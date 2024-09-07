import java.util.Scanner;
public class Whileloop {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int i;
        System.out.println("enter 0 to exit:");
        while(true)
        {
            System.out.println("enter any integer value:");
            i=obj.nextInt();
            if(i==0)
            {
                System.out.println("programm exit:");
                break;
            }
            System.out.println("you entered:"+i);
        }
        
    }
    
}
