package String;
import java.util.Scanner;
public class Str7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence ");
        String str=sc.nextLine();
       boolean rs=isPalindrome(str);
       if (rs) {
           System.out.println(str + " is Palindrome");
       }
       else {
           System.out.println(str + " is Not palindrome");
       }
    }
    static boolean isPalindrome(String str)
    {
        int i=0,j=str.length()-1;
            while (i<j)
            {
                if (str.charAt(i)!=str.charAt(j))
                {
                    return false;
                }
                i++;
                j--;
            }
            return true;
    }
}
