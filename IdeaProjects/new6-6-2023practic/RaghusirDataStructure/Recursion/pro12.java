package RaghusirDataStructure.Recursion;
import java.util.Scanner;
public class pro12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String st = sc.nextLine();
        boolean rs = isPalindrome(st);
        if (rs) System.out.println("palindrome");
        else System.out.println("Not palindrome");
    }
    public static boolean isPalindrome(String st) {
        return isPalindrome(st,0,st.length()-1);
    }
    public static boolean isPalindrome(String st,int s,int l) {
      if (s > l){
          return true;
      }
      if (st.charAt(s) != st.charAt(l)) {
          return false;
      }
      return isPalindrome(st,s+1,l-1);
    }
}
