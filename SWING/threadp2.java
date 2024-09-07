import  java.lang.*;
class threadp2 extends Thread
{
    public void run()
    {
      System.out.println("inside the run() method");
    }
    public static void main(String[] args) {
        threadp2 th1=new threadp2();
        threadp2 th2=new threadp2();
        threadp2 th3=new threadp2();

        System.out.println("priority of th1: "+th1.getPriority());
        System.out.println("priority of th1: "+th2.getPriority());
        System.out.println("priority of th1: "+th3.getPriority());

        th1.setPriority(3);
        th2.setPriority(6);
        th3.setPriority(9);

        System.out.println("priority of th1: "+th1.getPriority());
        System.out.println("priority of th1: "+th2.getPriority());
        System.out.println("priority of th1: "+th3.getPriority());


    }

}

