package String;
import java.util.Scanner;
public class str7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence");
        String st = sc.next();
        int vc =0;
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                vc++;
        }
        System.out.println(vc);
    }
}
