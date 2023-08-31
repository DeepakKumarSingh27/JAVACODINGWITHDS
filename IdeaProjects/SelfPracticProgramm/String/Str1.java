package String;
import java.util.Scanner;
public class Str1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String str=sc.nextLine();
        int uc=0,lc=0,dc=0,spc=0;
        for (int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if (ch>='A'&&ch<='Z')
                uc++;
            else if (ch>='a'&&ch<='z')
                lc++;
            else if (ch>='0'&&ch<='9')
                dc++;
            else
                spc++;
        }
        System.out.println("Number of capital letter is "+uc);//D
        System.out.println("Number of small letter is "+lc);//5
        System.out.println("Number of Digits is "+dc);//3
        System.out.println("Number of special character is "+spc);//1

    }
}
