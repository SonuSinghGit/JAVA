import java.util.Scanner;
public class me1Q7 {
    public static void main(String[] args) 
    {   
        int i,n,x,count=0,sum=0;
        float avg; 
        Scanner obj=new Scanner(System.in);
        System.out.println("enter how many number: ");
        n=obj.nextInt();
        System.out.println("enter the number: ");
        for(i=1;i<=n;i++)
        {
            x=obj.nextInt();

           if(x%3 == 0 && x%5==0)
           {
              sum=sum+x;
              count++;
           }
        } 
        System.out.println("sum of the number is: "+sum);
        avg=sum/count;        
        System.out.println("average value of the number ="+avg);
    }   
}
