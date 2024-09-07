//********************************************
//Program to see the working of join method
//********************************************


class A extends Thread
{
	double e;
  public void run()
   {
    	 for(int i=0;i<=14;i++)     
	   {
		e+=1.0/fact(i);
	   }
   }
	int fact(int n)	
	 {
	  if(n==0 ||n==1) 
		return 1;
	  else
		return n*fact(n-1);
	 }
}	
public class join
{
  public static void main(String [] aa)
	{
	   A a = new A();
	  System.out.println("Main thread starts");
	  a.setName("factorial calculation thread");
	  a.start();
	  System.out.println(a.getName()+ " is alive="+a.isAlive());
	  try
	  {
	  a.join();
	  }
	catch(InterruptedException e)
	  {
		System.out.println(e);
	  }
				  
	System.out.println("value of e is :"+a.e);
	System.out.println(a.getName()+ " is alive="+a.isAlive());
	System.out.println("exit from main");
	}
}