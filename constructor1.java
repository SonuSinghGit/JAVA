class test {
    int roll;
    int id;
    test(int a,int b)
    {
       int roll = a;
       int id = b;
       System.out.println("roll: "+a);
       System.out.println("id: "+b);
    }  
    
}
class constructor1
    {
        public static void main(String args[]) {
        test obj=new test(11,10);
        
    }
}

