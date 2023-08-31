package String;
import java.util.Scanner;
public class Str2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String ");
        String st=sc.nextLine();
        int vc=0,con=0;
        for (int i=0;i<st.length();i++)
        {
         char ch=st.charAt(i);
         if (ch>='A' &&ch<='Z') {
             if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                 vc++;
             else
                 con++;
         }
         else if (ch>='a' && ch<='z') {
             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                 vc++;
             else
                 con++;
         }
        }
        System.out.println("vowels present in string are "+vc);
        System.out.println("consonent present in string are "+con);
    }
}
