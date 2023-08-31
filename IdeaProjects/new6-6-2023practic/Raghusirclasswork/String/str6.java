package Raghusirclasswork.String;
import java.util.Scanner;
public class str6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String st = sc.next();
        int sum=0;
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (ch>='0' && ch<='9'){
                sum+=ch-'0';
            }
        }
        System.out.println(sum);
    }
}
