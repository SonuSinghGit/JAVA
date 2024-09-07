import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter integer number: ");
        int i = scan.nextInt();
        System.out.println("enter floating number: ");
        Double d = scan.nextDouble();
       // System.out.println("enter string : ");
        String s1=  new String("welcome to java ");
        

        // Write your code here.

        System.out.println("String: " + s1);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}