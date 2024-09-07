import java.io.IOException;

public class exceptionthrow {
    public static double divide(double x, double y)
    {
        if(y==0.0)
        throw new ArithmeticException("can not didvide by zero..!");
        else
        return x/y;
    }
    public static void main(String[] args) throws IOException
    {
        double c;
        try 
        {
            c=divide(10.0, 0);
            System.out.println(c);
        } 
        catch (ArithmeticException e) 
        {
           e.printStackTrace();
        }   
    }
    
}
