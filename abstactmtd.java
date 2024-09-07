abstract class father
{
    abstract void disp();
}
class son extends father
{
    void disp()
    {
        System.out.println("abstract class define in a sub class son ");
    }
}
class daughter extends father
{
    void disp()
    {
        System.out.println("abstract class define in a sub class daugher ");
    }
}

public class abstactmtd {
    public static void main(String[] args) 
    {
        son s=new son();
        daughter d= new daughter();
        s.disp();
        d.disp();
        
    }
}
