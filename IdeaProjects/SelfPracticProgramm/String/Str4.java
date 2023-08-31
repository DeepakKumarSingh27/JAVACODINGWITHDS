package String;
import java.util.Scanner;
public class Str4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < ch.length; i++)
        {
           if (ch[i]>='0'&&ch[i]<='9')
           {
               sum=sum+ch[i]-'0';
           }
        }
        System.out.println("Sum of Digits is "+sum);
    }
}