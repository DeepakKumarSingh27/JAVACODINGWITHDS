package String;
import java.util.Scanner;
public class Str9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String st=sc.nextLine();
        boolean rs=isAnagram(st);
        if (rs==true)
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
    static boolean isAnagram(String st) {
        if (st.length()>26)
        {
            return false;
        }
        int[] count=new int[26];
        for (int i = 0; i < st.length(); i++) {
            char ch=st.charAt(i);
            if (ch>='A'&& ch<='Z')
                count[ch-65]++;
            else if(ch>='a' && ch<='z')
                count[ch-97]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i]==0)
                return false;
        }
        return true;
    }
}
