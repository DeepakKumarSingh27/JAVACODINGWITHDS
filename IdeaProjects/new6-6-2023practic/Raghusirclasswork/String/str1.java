package Raghusirclasswork.String;
import java.util.Scanner;
public class str1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence");
        String st= sc.next();
        int cl=0,sl=0,dg=0,sp=0;
        for (int i = 0; i < st.length(); i++) {
            char ch= st.charAt(i);
            if (ch>='0' && ch <='9'){
                dg++;
            } else if (ch>='A' && ch <='Z'){
                cl++;
            }else if (ch>='a' && ch<='z'){
                sl++;
            }else {
                sp++;
            }
        }
        System.out.println("capital letter is "+cl);
        System.out.println("small letter is "+sl);
        System.out.println("Digit is "+dg);
        System.out.println("special character is "+sp);


    }
}
