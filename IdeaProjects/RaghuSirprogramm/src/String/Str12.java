package String;
import java.util.Scanner;
public class Str12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first String");
        String st1=sc.nextLine();
        System.out.println("Enter second String");
        String st2=sc.nextLine();
        boolean rs=isAnagram(st1,st2);
        if (rs==true)
            System.out.println("string are anagram");
        else
            System.out.println("string are not anagram");
    }
    static boolean isAnagram(String s1, String s2)
    {
        int[] c1=countFrqAlp(s1);
        int[] c2=countFrqAlp(s2);
        for (int i=0;i<26;i++)
        {
            if (c1[i]!=c2[i])
                return false;
        }
        return true;
    }
    static int[] countFrqAlp(String s1)
    {
        int[] count=new int[26];
        for (int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if (ch>='A' && ch<='Z')
                count[ch-65]++;
            else if(ch>='a'&&ch<='z')
                count[ch-97]++;
        }
        return count;
    }
}
