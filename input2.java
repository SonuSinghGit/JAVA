import java.util.Scanner;
public class input2 {
    public static void main(String[] args) {
        int a;
        float b;
        String str;
        Scanner obj = new Scanner(System.in);
        System.out.print("enter string: ");
        str=obj.nextLine();
        System.out.println("string: "+str);
        System.out.print("enter integer:");
        a=obj.nextInt();
        System.out.println("integer= "+a);
        System.out.println("enter the floating number:");
        b=obj.nextFloat();
        System.out.println("float ="+b);
        }
    }
    

