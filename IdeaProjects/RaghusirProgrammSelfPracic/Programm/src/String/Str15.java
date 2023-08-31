package String;
import java.util.Scanner;
public class Str15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first word");
        String st=sc.nextLine();
        System.out.println("Enter first word");
        String st1=sc.nextLine();
        boolean rs=isAnagram(st,st1);
        if (rs==true)
            System.out.println("is Anagram");
        else
            System.out.println("are not Anagram");
    }
    static boolean isAnagram(String st, String st1)
    {
        int[] c1=freaquencycount(st);
        int[] c2=freaquencycount(st1);
        for (int i=0;i<26;i++) {
            if (c1[i] != c2[i])
                return false;
        }
        return true;
    }
    static int[] freaquencycount(String st)
    {
        int[] count=new int[26];
        for (int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if (ch>='A'&&ch<='Z')
            count[ch-65]++;
            else if (ch>='a'&&ch<='z')
                count[ch-97]++;
        }
        return count;
    }
}
