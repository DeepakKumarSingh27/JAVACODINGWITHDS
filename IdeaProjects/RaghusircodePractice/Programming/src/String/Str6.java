package String;
import java.util.Scanner;
public class Str6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String st=sc.nextLine();
        int sum=0;
        for (int i = 0; i < st.length(); i++) {
            char ch=st.charAt(i);
            if (ch>='0'&& ch<='9')
            {
                sum=sum+ch-48;
            }
        }
       // System.out.println("sum of Digits is "+sum);
        for (int i = 0; i <= 255; i++) {
            System.out.println((char) i+" "+i);
        }
    }
}
/*
Deepak1234

 */