package String;
import java.util.Scanner;
public class str16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence");
        String st= sc.nextLine();
        String str = swapLetters(st);
        System.out.println(str);
    }

    public static String swapLetters(String st) {
        char[] ch = st.toCharArray();
        int f =0;
        for (int i = 1; i <ch.length ; i++) {
            if (i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' '){
                f=i;
            }
            else if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' '){
                char temp=ch[i];
                ch[i]=ch[f];
                ch[f]=temp;
            }
        }
        st= new String(ch);
        return st;
    }
}
