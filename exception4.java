public class exception4 
{
	public static void main (String[] args) 
    {
	    int a=5;
	    int b=0;
        int num[]={12,34,45,6,34,23};
		try
        {
		System.out.println(a/b);
        System.out.println(num[6]);
		}
	    catch(ArithmeticException e)
        {
		   System.out.println("divided by zero is not allowed:");
	    }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("something went wrong:");
        }
	}
    
}
