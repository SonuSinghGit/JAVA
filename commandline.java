public class commandline {
    public static void main(String[] args) 
    {
        int a,b,c;
        if(args.length!=3)
        {
            System.out.println("error");
            return;
        }
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        c=Integer.parseInt(args[2]);
        int y=a>b?(a>c?a:c):(b>c?b:c);
        System.out.println(y);
                
    }
    
}
