package String;
import java.util.Scanner;
public class str14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence");
        String st = sc.nextLine();
        int ct = wordCount(st);
        System.out.println(ct);
    }

    public static int wordCount(String st) {
        char[] ch = st.toCharArray();
        int count =0;
        for (int i = 0; i < ch.length; i++) {
            if (i==0&&ch[i]!=' ' || ch[i]!=' '&&ch[i-1]==' ')
                count++;
        }
        return count;
    }
}
