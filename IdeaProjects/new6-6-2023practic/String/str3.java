package String;
import java.util.Scanner;
public class str3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence ");
        String st = sc.next();
        boolean rs = isPalindrome(st);
        if (rs) System.out.println(st+" is palindrome");
        else System.out.println(st+" not is palindrome");
    }

    public static boolean isPalindrome(String st) {
        int first = 0,last = st.length()-1;
       while (first < last) {
           if (st.charAt(first) != st.charAt(last))
               return false;
           first++;
           last--;
       }
         return true;
    }
}
