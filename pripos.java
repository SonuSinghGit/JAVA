// public class pripos 
// {
//     public static void main(String args[])
//     {
//         int a=4,b,c;
//         a+= ++a + a-- + --a; 
//         //System.out.println(a);
//         b = a++ * ++a;
//         //System.out.println(b);
//         c=a++ + ++b;
//         //System.out.println(c);
//         System.out.println(a);//20
//         System.out.println(b);//323
//         System.out.println(c);//343  
//     }   
// }

// public class pripos 
// {
//     public static void main(String args[])
//     {
//         int a=5;
//         a+= ++a + a++ + ++a; 
//         System.out.println(a); // 25
//     }   
// }
public class pripos 
{
    public static void main(String args[])
    {
        int a=5, b , c;
        a+=++a + a-- + --a;
        System.out.println(a);//21
        b= a++ * ++a;
        c=a++/++a;
        System.out.println(a);
        System.out.println(b);  
        System.out.println(c);   
    }   
}