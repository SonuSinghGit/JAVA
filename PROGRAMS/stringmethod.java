public class stringmethod {
    public static void main(String[] args) {
        char y[]=new char[5];
        y[0]='A';
        y[1]='N';
        y[2]='K';
        y[3]='I';
        y[4]='T';
        String s3=new String(y);
        System.out.println(s3);
        String s1=new String("Gaurav Kumar");
        String s2=new String("sonu Kumar");
        System.out.println(s1);
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.replace('r', 't'));
        System.out.println(s1.charAt(5));
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.indexOf('r', 4));
        System.out.println(s1.substring(3, 6));
        System.out.println(s1.substring(3,8));
        System.out.println(s1.equalsIgnoreCase(s2));

    }
}