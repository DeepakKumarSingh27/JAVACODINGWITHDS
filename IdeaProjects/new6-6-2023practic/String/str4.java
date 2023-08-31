package String;
import java.util.Scanner;
public class str4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence");
        String st = sc.next();
        int sp =0;
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if ((ch>='a'&&ch<='z' || ch>='A'&&ch<='Z'||ch>='0'&&ch<='9')== false)
                sp++;
        }
        System.out.println(sp);
    }
}
