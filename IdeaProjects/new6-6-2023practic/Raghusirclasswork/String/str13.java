package Raghusirclasswork.String;
import java.util.Scanner;
public class str13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two sentence");
        String st1 = sc.next();
        String st2= sc.next();
        boolean rs = isAnagram(st1,st2);
        if (rs) System.out.println("Anagram");
        else System.out.println("not anagram");
    }
    public static boolean isAnagram(String st1, String st2) {
        int[] count1 =countfreq(st1);
        int[] count2=countfreq(st2);
        for (int i = 0; i <26 ; i++) {
            if (count1[i] != count2[i])
                return false;
        }
        return true;
    }
    public static int[] countfreq(String st) {
        int[] count = new int[26];
        for (int i = 0; i <st.length() ; i++) {
            char ch= st.charAt(i);
            if (ch>='A'&&ch<='Z') count[ch-65]++;
            else if (ch>='a'&&ch<='z') count[ch-97]++;
        }
        return count;
    }
}
