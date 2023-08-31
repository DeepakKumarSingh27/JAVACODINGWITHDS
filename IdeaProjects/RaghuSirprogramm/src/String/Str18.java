package String;
import java.util.Scanner;
public class Str18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String st=sc.nextLine();
        st=reverseSentence(st);
        System.out.println(st);
    }
    static String reverseSentence(String st)
    {
        char ch[]=st.toCharArray();
        String rs=" ";
        for (int i=ch.length-1;i>=0;i--)
        {
            int l=i;
            while(i>=0 && ch[i]!=' ')
            {
                i--;
            }
            int f=i+1;
            while (f<=l)
            {
                rs=rs+ch[f];
                f++;
            }
            if (i>=0)
                rs=rs+ch[i];
        }
        return rs;
    }
}
