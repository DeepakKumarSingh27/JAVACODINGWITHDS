package Raghusirclasswork.String;
import java.util.Scanner;
public class str18 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence");
        String st= sc.nextLine();
        st=reverseword(st);
        System.out.println(st);
    }
    public static String reverseword(String st) {
       String rs="";
       char[] ch= st.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int f=i;
            while (i<ch.length&&ch[i]!=' '){
                i++;
            }
            int l = i-1;
            while (i>=f){
                l--;
            }
            if (i<ch.length-1)
                rs=rs+ch[i];
        }
        return rs;
    }
}
