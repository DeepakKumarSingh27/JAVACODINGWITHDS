package String;
import java.util.Scanner;
public class str12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first sentence");
        String st1 = sc.next();
        System.out.println("Enter second sentence");
        String st2 = sc.next();
        boolean rs = isAnagram(st1,st2);
        if (rs)
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }

    public static boolean isAnagram(String st1, String st2) {
        int[] c1 = CountFreq(st1);
        int[] c2 = CountFreq(st2);
        for (int i = 0; i < 26; i++) {
         if (c1[i] != c2[i])
             return false;
        }
        return true;
    }

    public static int[] CountFreq(String st) {
        int[] count = new int[26];
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (ch>='A' && ch<= 'Z') count[ch-65]++;
            else if (ch>='a' && ch <='z') count[ch-97]++;
        }
        return count;
    }
}
