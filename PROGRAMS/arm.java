import java.util.Scanner;
public class arm {
    public static void main(String arga[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int n = sc.nextInt();
        int len=0;
        double result=0;
        int m;
        int y=m=n;
        while(n>0)
        {
            n=n/10;
            len++;
        }
        int rem=0;
        while(m>0)
        {
            rem = m%10;
            result+=Math.pow(rem,len);
            m=m/10;
        }
      if(y==result)
      {
        System.out.println("number is Armstrong");
      }
      else{
        System.out.println("Not Armong");
    }
  }
}