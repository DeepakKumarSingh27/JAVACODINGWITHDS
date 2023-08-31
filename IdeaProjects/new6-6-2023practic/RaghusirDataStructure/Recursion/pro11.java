package RaghusirDataStructure.Recursion;
import java.util.Scanner;
public class pro11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String st = sc.nextLine();
        System.out.println(reverse(st));
    }

    public static String reverse(String st) {
       return reverse(0,st);
    }
    public static String reverse(int in , String st) {
        if (in == st.length()-1) {
            return st.charAt(in) + "";
        }
        return reverse(in+1,st)+st.charAt(in);
    }
}
