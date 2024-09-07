public class exceptionthrow2 
{
    public static void divide(int x, int y)
    {
        try
        {
          int z=x/y;
          System.out.println(z);
        }
        catch(ArithmeticException e)
        {
            System.out.println("divided by zero: ");
            System.out.println(" caught in divide function rethorowing now:");
           throw e;
        }
    }
    public static void main(String[] args) 
    {
        try 
        {
            divide(12,0);
        } 
        catch (ArithmeticException e) 
        {
           e.printStackTrace();
        }   
    }
    
}
 
    

