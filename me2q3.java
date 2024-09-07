public class me2q3 {
    void sum(int a,float b)
    {
        int x=a;
        float y=b;
        System.out.println(a+b);
        
    }
    void sum(long c,double d)
    {
        long p=c;
        double q=d;
        System.out.println(c+d);
    }
    public static void main(String[] args) 
    {
        me2q3 obj=new me2q3();
        obj.sum(5,12.6f);
        obj.sum(9,12.456);
    }
    
}
