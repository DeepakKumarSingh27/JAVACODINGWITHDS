package String;
import java.util.Scanner;
public class Str5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int vc= 0;
        for (int i = 0; i < ch.length; i++)
        {
            if (ch[i]>='A'&&ch[i]<='Z'|| ch[i]>='a'&&ch[i]<='z')
if (ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'||ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
            vc++;
        }
        System.out.println("vowels present in string are-> "+vc);
        }
    }
