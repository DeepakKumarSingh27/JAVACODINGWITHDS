package String;
import java.util.Scanner;
public class Str17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String st=sc.nextLine();
        int count=countWord(st);
        System.out.println("in string "+count+" words are present");
    }
    static int countWord(String st)
    {
        int count =0;
        char[] ch=st.toCharArray();
        for (int i=0;i<ch.length;i++)
        {
            if (i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
                count++;
        }
        return count;
    }
}
