package String;
import java.util.Scanner;
public class Str6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String st=sc.nextLine();
        int sum=0;
        char ch[]=st.toCharArray();
        for (int i=0;i<ch.length;i++) {
            if (ch[i] >= '0' && ch[i] <= '9')
            {
                sum = sum + ch[i] - '0';
            }
        }
        System.out.println("sum of Digits is-->"+sum);
    }
}
