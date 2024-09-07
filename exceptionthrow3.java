public class exceptionthrow3 
{
    public static void validate(int age)
    {
        if(age>18)
        {
        System.out.println("person are eligible to vote.. ");
        }
        else
        {
        throw new ArithmeticException("your age is short..");
        }
    }
    public static void main(String[] args) 
    {
        try
        {
            validate(2);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
         System.out.println("rest of the code..");
    }   
} 

