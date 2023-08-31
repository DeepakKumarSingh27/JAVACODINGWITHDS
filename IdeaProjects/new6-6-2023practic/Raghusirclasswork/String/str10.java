package Raghusirclasswork.String;
import java.util.Scanner;
public class str10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String st = sc.next();
        System.out.println(palindrome1(st));
//        boolean rs = palindrome(st);
//        if (rs) System.out.println("Palindrome");
//        else System.out.println("not palindrome");
    }

    public static boolean palindrome(String st) {
        int i = 0, j = st.length() - 1;
        while (i < j) {
            if (st.charAt(i) != st.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static String palindrome1(String st) {
        String st1="";
        for (int i = 0; i < st.length(); i++) {
            st1=st.charAt(i)+st1;
        }
        return st1;
    }
}