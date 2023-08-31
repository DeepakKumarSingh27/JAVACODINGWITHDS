package String;
import java.util.Scanner;
public class Str14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String st=sc.nextLine();
        int wc=countword(st);
        System.out.println(wc);
    }

    private static int countword(String st)
    {
        int count=0;
        char[]ch=st.toCharArray();
        for (int i=0;i<ch.length;i++)
        {
            if (i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
                count++;
        }
        return count;
    }
}
