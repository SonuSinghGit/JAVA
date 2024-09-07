import java.util.Scanner;
class me2q1
{
   public static void main(String arg[])
   {
       long n,p,r=1;
       Scanner obj=new Scanner(System.in);
       System.out.print("enter the number: ");
       n=obj.nextLong();
       System.out.print("enter power of the given number: ");
       p=obj.nextLong();
       if(n>=0&&p==0)
       {   
          r =1;
       }
       else if(n==0&&p>=1)
	   {   
            r=0;
	   } 
       else
	   { 
         for(int i=1;i<=p;i++)
	      { 
            r=r *n;
 	 	   }    
    	}   
    	  System.out.println(n+"^"+p+"="+r);
   }
}