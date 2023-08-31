package String;
import java.util.Scanner;
public class Str6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String str=sc.nextLine();
        int spc=0;
        for (int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if (ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'||ch>='0'&&ch<='9')
            {

            } else
            {
                spc++;
            }
        }
        System.out.println("special character are->>>> "+spc);
    }
}
