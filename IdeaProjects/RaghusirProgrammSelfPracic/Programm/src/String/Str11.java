package String;
import java.util.Scanner;
public class Str11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String st = sc.nextLine();
        boolean rs= palindrome(st);
        if (rs==true)
        System.out.println(st+" is palindrome ");
        else
        System.out.println(st+" is not palindrome ");

    }
    static boolean palindrome(String st) {

        char[] ch = st.toCharArray();
        int i = 0, j = st.length() - 1;
        while (i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
     String    st1 = new String(ch);
        if (st1.equals(st))
            return true;
        else
            return false;
    }
}
