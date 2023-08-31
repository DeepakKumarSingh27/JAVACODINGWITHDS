package String;
import java.util.Scanner;
public class str8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String st= sc.next();
        int sp =0;
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if ((ch>='0'&&ch<='9'||ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')== false) {
                sp++;
            }
        }
        System.out.println(sp);
    }
}
