package Raghusirclasswork.String;
import java.util.Scanner;
public class str3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String st = sc.next();
        boolean rs = isPalindrome(st);
        if (rs) System.out.println("palindrome");
        else System.out.println("Not palindrome");
    }
    public static boolean isPalindrome(String st) {
        int first=0,last=st.length()-1;
       while (first<last){
           if(st.charAt(first)!=st.charAt(last)){
               return false;
           }
           first++;
           last--;
       }
       return true;
    }
}
