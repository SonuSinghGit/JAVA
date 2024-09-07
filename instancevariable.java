public class instancevariable 
{
    int roll=10;
    int marks;
    public static void main(String args[]) 
    {

        instancevariable obj=new instancevariable();
        obj.marks=200;
        System.out.println("roll no= "+obj.roll);
        System.out.println("marks= "+obj.marks);

    }
    
}
