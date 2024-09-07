import java.util.Scanner;
class palindrom    
{    
    public static void main(String[] args) {    
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the string:");
        String str =obj.nextLine();    
        boolean flag = true;    
               
        str = str.toLowerCase();    
          
        for(int i = 0; i < str.length()/2; i++){    
            if(str.charAt(i) != str.charAt(str.length()-i-1)){    
                flag = false;    
                break;    
            }    
        }    
        if(flag)    
            System.out.println("Given string is palindrome");    
        else    
            System.out.println("Given number is not a palindrom number ");    
    }    
}    