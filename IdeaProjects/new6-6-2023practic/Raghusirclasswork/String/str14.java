package Raghusirclasswork.String;
import java.util.Scanner;
public class str14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String st = sc.nextLine();
        String st1=intCap(st);
        System.out.println(st1);
    }
    public static String intCap(String st) {
        char[] ch = st.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (i==0&&ch[i]!=' ' ||ch[i]!=' '&&ch[i-1]==' ')
            {
                if (ch[i]>='a' && ch[i]<='z')
                    ch[i] = (char)(ch[i]-32);
            } else if (ch[i]>='A' && ch[i]<='Z')
                ch[i] = (char)(ch[i]+32);
        }
        st= new String(ch);
        return st;
    }
}
