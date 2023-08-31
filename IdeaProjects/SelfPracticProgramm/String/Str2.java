package String;
import java.util.Scanner;
public class Str2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String str=sc.nextLine();
        int vc=0,cc=0;
        for (int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if (ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                vc++;
            else
                cc++;
        }
        System.out.println("number of vowels letter present are "+vc);
        System.out.println("number of consonant letter present are "+cc);

    }
}
