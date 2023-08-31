package String;
import java.util.Scanner;
public class Str1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String st=sc.nextLine();
        int cletter=0,sletter=0,digit=0,sp=0;
        for (int i = 0; i < st.length(); i++) {
            char ch=st.charAt(i);
            if (ch>='A' && ch<='Z')
            {
                cletter++;
            }else if (ch>='a'&& ch<='z')
            {
                sletter++;
            } else if (ch>='0' && ch<='9')
            {
                digit++;
            }
            else {
                sp++;
            }
        }
        System.out.println("capital letter"+cletter);
        System.out.println("small letter "+sletter);
        System.out.println("Digit "+digit);
        System.out.println("special character "+sp);
    }
}
