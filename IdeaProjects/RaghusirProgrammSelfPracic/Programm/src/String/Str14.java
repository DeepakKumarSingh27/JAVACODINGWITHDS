package String;
import java.util.Scanner;
public class Str14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first sentence");
        String s1=sc.nextLine();
        System.out.println("Enter second sentence");
        String s2=sc.nextLine();
        boolean rs=isAnagram(s1,s2);
        if (rs==true)
            System.out.println("Anagram");
        else
            System.out.println("Not a Anagram");
    }
    static boolean isAnagram(String s1, String s2)
    {
        int[] c1=countfrequency(s1);
        int[] c2=countfrequency(s2);
        for (int i=0;i<26;i++)
        {
            if (c1[i]!=c2[i])
                return false;
        }
        return true;

    }
    static int[] countfrequency(String st)
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
