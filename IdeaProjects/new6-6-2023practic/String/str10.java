package String;
import java.util.Scanner;
public class str10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence");
        String st = sc.next();
        int[] count = new int[26];
        for (int i = 0; i <st.length() ; i++) {
            char ch =st.charAt(i);
            if (ch>='A'&&ch<='Z') count[ch-65]++;
            else if (ch>='a'&&ch<='z') count[ch-97]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i]!=0) System.out.println((char) (i+65)+" -> "+count[i]);
        }
    }
}
