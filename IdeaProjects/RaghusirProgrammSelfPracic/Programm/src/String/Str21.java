package String;
import java.util.Scanner;
public class Str21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String st=sc.nextLine();
        st=reverseSentence(st);
        System.out.println(st);
   }
   static String reverseSentence(String st)
   {
       char[] ch=st.toCharArray();
       String rs="";
       for (int i = 0;i< ch.length;i++)
       {
           int f = i;
           while(i < ch.length && ch[i] != ' '){
               i++;
           }
           int r = i-1;
           while(r >= f){
               rs = rs + ch[r];
               r--;
           }
           if(i < ch.length - 1)
               rs = rs + ch[i];
       }
       return rs;
    }
}
