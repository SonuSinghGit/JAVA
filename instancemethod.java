public class instancemethod 
{
    public static void main(String args[]) {
        Test obj=new Test();
        obj.disp(20);
        
    }
}
class Test
{
     void disp(int a)
     {
        int x=10,y=a;
        int z=x+y;
        System.out.println("addition= "+z);
     }
}
