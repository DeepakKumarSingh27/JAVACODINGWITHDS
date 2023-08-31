package String;
import java.util.Scanner;
public class Str11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String str=sc.nextLine();
        boolean rs=isPanagram(str);
        if (rs)
        {
            System.out.println(str+" is  pangram ");
        }
        else
        {
            System.out.println(str+" is not pangram");
        }
    }
    static boolean isPanagram(String str)
    {
        if (str.length()<26)
        {
            return false;
        }
        int[] count=new int[26];
        for (int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if (ch>='A'&&ch<='Z')
                count[ch-65]++;
            else if (ch>='a'&&ch<='z')
                count[ch-97]++;
        }
        for (int i=0;i<count.length;i++)
        {
            if (count[i]==0)
                return false;
        }
        return true;
    }
}
