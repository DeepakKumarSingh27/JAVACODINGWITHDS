package String;
import java.util.Scanner;
public class Str20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String st=sc.nextLine();
        st=reverseWord(st);
        System.out.println(st);
        System.out.printf("hai");
    }
    static String reverseWord(String st)
    {
        String rs="";
        char ch[]=st.toCharArray();
        for (int i=0;i<ch.length;i++)
        {
            int f=i;
            while (i<ch.length && ch[i]!=' ')
            {
                i++;
            }
            int l=i-1;
            while (l>=f)
            {
                rs=rs+ch[i];
                l--;
            }
            if (i<ch.length)
                rs=rs+ch[i];
        }
        return rs;
    }
}
/*
Deepak is a good boy
->kqpeed si a doog yob
 */