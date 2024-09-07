import java.io.IOException;
public class exceptionthrows 
{
    public static double div(double a,double b) 
    {
        if(b==0)
        
           throw new ArithmeticException();
        
        else
            return a/b;
        
    }
    public static void main(String[] args) throws ArithmeticException
    {
        double c;
        try{
        c=div(10.0,0.0);
        System.out.println(c);
        }catch(Exception e){
            e.printStackTrace();

        }
    }

    
}
