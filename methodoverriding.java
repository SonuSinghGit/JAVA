class father
{
    int a=100;
    void cal()
    {
       System.out.println("super class father:");
    }
}
class son extends father
{
    int b=20;
    void cal()
    {
       int sum=a+b;
       System.out.println("sub class son:");
       System.out.println("addition=:" +sum);
    }
}
class daughter extends father
{
    int c=10;
    void cal()
    {
       int mul=a*c;
       System.out.println("sub class daughter ");
       System.out.println("multiplication=:"+ mul);
    }
}
public class methodoverriding 
{
    public static void main(String[] args) 
    {
        father obj=new father();
        son obj2=new son();
        daughter obj3= new daughter();
        obj.cal();
        obj2.cal();
        obj3.cal();    
    }   
}
