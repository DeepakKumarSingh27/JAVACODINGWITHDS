package String;
import java.util.Scanner;
public class str5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence");
        String st = sc.next();
        /*
        method 1
        char[] ch = st.toCharArray();
        boolean[] rs= new boolean[st.length()];
        for (int i = 0; i < ch.length; i++) {
            if (rs[i] == false) {
                int ct = 1;
                for (int j = i + 1; j < ch.length; j++) {
                    if (ch[i] == ch[j]) {
                        ct++;
                        rs[j] = true;
                    }
                }
                System.out.println(ch[i] + " -> " + ct);
            }
        }

         */
        int[] count = new int[128];
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            count[ch]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i]!=0) {
                System.out.println((char) i + " -> " + count[i]);
            }
        }

    }
}
