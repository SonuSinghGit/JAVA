import java.util.Scanner;
public class shahil
 {
   public static void main(String args[])
    {
	String s[]=new String[5];
	String t;
	int z=0;
	Scanner ob = new Scanner(System.in);
	for (int i=0;i<5;i++)
	 {
	   System.out.print("Enter name "+(i+1)+":");
	   s[i]=ob.nextLine(); 
     }
	System.out.print("Enter a name to search:");
	t = ob.nextLine();
	for(int i=0;i<5;i++)
	 { 
           if(s[i].compareTo(t)==0)
             {
                System.out.println("name "+t+" found at index "+(i+1));
		        z=1;
	        break;
             }
	}
           
   }
 
}
    

