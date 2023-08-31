package String;
import java.util.Scanner;
public class Str13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String st=sc.nextLine();
        boolean rs=ispanagram(st);
        if (rs==true)
            System.out.println(st+" is Panagram");
        else
            System.out.println(st+" is not pAnagram");
    }
    static boolean ispanagram(String st)
    {
        int[] count=new int[128];

        for (int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if (ch>='A'&&ch<='Z')
                count[ch-65]++;
            else if (ch>='a'&&ch<'z')
                count[ch-97]++;
        }
        for (int i=0;i<count.length;i++)
        {
            if (count[i]==0)
                return false;
        }
        return true;



        /*for (int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            count[ch]++;
        }
        for (int i=0;i<count.length;i++)
        {
            if (count[i]==0)
                return false;
        }
        return true;

         */
    }
}
