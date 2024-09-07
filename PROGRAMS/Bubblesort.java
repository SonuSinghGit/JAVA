import java.util.Scanner;
public class Bubblesort 
{
    public static void main(String[] args) 
    {
        String s[]=new String[10];
        Scanner obj=new Scanner(System.in);
        String k;
        for(int i=0;i<5;i++)
        {
            System.out.println("enter string " +(i+1)+":");
            s[i]=obj.nextLine();
           
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<5-i-1;j++)
            {
                if(s[j].compareTo(s[j+1])>0)
                {                  
                    k=s[j];
                    s[j]=s[j+1];
                    s[j+1]=k;
                }
            }
        }
        System.out.println("sorted string are:");
        for(int i=0;i<5;i++)
        {
            System.out.println(s[i]);
        }
    }         
}
