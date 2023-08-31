package String;
import java.util.Scanner;
public class Str9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String st=sc.nextLine();
        st=reverse(st);
    }
    static String reverse(String st)
    {
        char[] ch=st.toCharArray();
        int i=0,j=ch.length-1;
        while(i<j)
        {
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        st=new String(ch);
        return st;
    }
}
