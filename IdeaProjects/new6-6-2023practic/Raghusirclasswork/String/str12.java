package Raghusirclasswork.String;
import java.util.Scanner;
public class str12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String st = sc.next();
        boolean rs = isPanagram(st);
        if (rs)
            System.out.println("panagram");
        else System.out.println("Not panagram");
    }
    public static boolean isPanagram(String st) {
      int[] count = new int[26];
      if (st.length() >26){
          return false;
      }
        for (int i = 0; i < st.length(); i++) {
            char ch= st.charAt(i);
            if (ch>='A' && ch<='Z') count[ch-65]++;
            else if (ch>='a'&&ch<='z') count[ch-97]++;
        }
        for (int i = 0; i<count.length; i++) {
            if (count[i]==0)
                return false;
        }
        return true;
    }
}
