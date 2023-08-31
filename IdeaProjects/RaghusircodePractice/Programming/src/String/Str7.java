package String;
import java.util.Scanner;
public class Str7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String st=sc.nextLine();
        st=reverse(st);
        System.out.println(st);
    }
    static String reverse(String st) {
        char[] ch=st.toCharArray();
        int i =0,j=ch.length-1;
        while (i<j)
        {
            char temp =ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            j--;
            i++;
        }
        st=new String(ch);
        return st;
    }
}
/*
manshi->
ihsnam
 */