package String;
import java.util.Scanner;
public class str17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence");
        String st = sc.nextLine();
        st = reverseWords(st);
        System.out.println(st);
    }

    public static String reverseWords(String st) {
        String rs="";
       char[] ch = st.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int f = i;
            while (i<ch.length && ch[i]!=' '){
                i++;
            }
            int l = i-1;
            while (l>=f){
                rs=rs+ch[l];
                l--;
            }
            if (i<ch.length-1)
                rs=rs+ch[i];
        }
        return rs;
    }
}
