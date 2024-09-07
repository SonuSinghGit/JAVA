public class constructorol {
    public static void main(String args[]) {
        Test obj=new Test();
        Test obj2=new Test(67);
        Test obj3=new Test(12,45);
        Test obj4=new Test(13,46,67);
       
    }
}
class Test
{
    Test()
    {
        System.out.println("default constructor");
    }
    Test(int a)
    {
        System.out.println("A:= "+ a);
    }
    Test(int a , int b)
    {
        int x=a;
        int y=b;
        System.out.println("A= "+a + "B: "+b);
    }
    Test(int a , int b,int c)
    {
        int x=a;
        int y=b;
        int z=c;
        System.out.println("A= "+a + "B: "+b+ "C= "+c);
    }
}