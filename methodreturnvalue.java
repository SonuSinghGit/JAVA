public class methodreturnvalue {
    public static void main(String[] args) {
        test obj=new test();
        System.out.println("addition="+obj.add());
        int r=obj.mul(2,4);
        System.out.println("multiplication="+r);   
    }
}
class test
{
    int add()
    {
        int a=10,b=20;
           return a+b;
    }
    int mul(int c,int d)
    {
      int  x = c;
      int  y = d;
          return(c*d);                                                                            
    }
}

