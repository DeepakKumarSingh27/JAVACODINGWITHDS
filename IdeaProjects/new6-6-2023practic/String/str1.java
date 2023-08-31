package String;
import java.util.Scanner;
public class str1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence ");
        String st = sc.next();
        int cp =0,sm=0,dg=0,sp=0;
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (ch>='0' && ch<='9')
              dg++;
            else if (ch>='A' && ch<='Z')
                cp++;
            else if (ch>='a' && ch<='z')
                sm++;
            else sp++;
        }
        System.out.println("Digits are "+dg);
        System.out.println("capital letter are "+cp);
        System.out.println("Small letter are "+sm);
        System.out.println("special character are "+sp);
    }
}
