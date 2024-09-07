public class exception3 
{
    public static void main(String[] args) 
    {
        int a=10;
        int b=0;
        int c=0;
        int num[]={23,45,5,67};
        try
        {
            c=a/b;
            System.out.println(c);
            System.out.println(num[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("hey user divided by 0 is not allowed..!");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("stay in your limit..!");
        }
        
    }
    
}
