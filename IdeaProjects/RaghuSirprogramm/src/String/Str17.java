package String;
import java.util.Scanner;
public class Str17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String st=sc.nextLine();
       String st1=reverseWord(st);
        System.out.println(st1);
    }
    static String reverseWord(String st)
    {
        String rs=" ";
        char []ch=st.toCharArray();
        for (int i=0;i<ch.length;i++)
        {
            int f=i;
            while (i<ch.length&&ch[i]!=' ')
            {
                i++;
            }
            int l=i-1;
            while (i>=f)
            {
                rs=rs+ch[i];
                i--;
            }
            if (i<=ch.length)
                rs=rs+ch[i];
        }
        return rs;
    }
}
