package String;
import java.util.Scanner;
public class Str2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence ");
        String st = sc.next();
        int vc =0,cc=0;
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                vc++;
            else if (ch >= 'a' && ch <= 'z')
                cc++;
        }
        System.out.println("vowels are "+vc);
        System.out.println("consonant are "+cc);
    }
}
