package String;
import java.util.Scanner;
public class Str4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String st=sc.nextLine();
        int sp=0;
        for (int i = 0; i < st.length(); i++) {
            char ch=st.charAt(i);
            if ((ch>='0'&& ch<='9' || ch>='A' && ch<='Z' || ch>='a'&& ch<='z')==false)
                sp++;
        }
        System.out.println("special character is "+sp);
    }
}
