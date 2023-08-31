package Raghusirclasswork.String;
import java.util.Scanner;
public class str9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String st = sc.next();
       // String st2= st;
        char[] ch=st.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int first = 0 ,end = ch.length-1;
            while (first < end){
                char temp = ch[first];
                ch[first] =ch[end];
                ch[end] = temp;
                first++;
                end--;
            }
        }
        String st2= new String(ch);
        if (st.equals(st2))
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }
}
