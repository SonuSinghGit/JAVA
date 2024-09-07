import  java.lang.*;
class   A extends Thread{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("from therd A i="+ i);
        }
        System.out.println("exit ffrom A");
    }

}
class B extends Thread{
    public void run()
    {
        for(int j=0;j<5;j++)
        {
            System.out.println("from therd B j="+ j);
        }
        System.out.println("exit ffrom b");
    }

}
class threadp1
{
    public static void main(String[] args) {
        A obj1= new A();
        obj1.start();
        B obj2=new B();
        obj2.start();
    }
}