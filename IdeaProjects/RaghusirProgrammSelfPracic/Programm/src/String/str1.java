package String;
import java.util.Scanner;
public class str1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String st=sc.nextLine();
        int vc=0,cc=0,dg=0,sp=0;
        for (int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if (ch>='A'&& ch<='Z')
                vc++;
            else if (ch>='a'&&ch<='z')
                cc++;
            else if (ch>='0'&&ch<='9')
                dg++;
            else
                sp++;
        }
        System.out.println("capital letter are "+vc);
        System.out.println("small letter are "+cc);
        System.out.println("digits are "+dg);
        System.out.println("special character are "+sp);
    }
}
