package RaghusirDataStructure.Recursion;
import java.util.Scanner;
public class pro17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String st = sc.nextLine();
        permutation(st.toCharArray(),0);
    }
    public static void permutation(char[] ch,int fi) {
          if (fi == ch.length-1){
              System.out.println(ch);
              return;
          }
        for (int i = fi; i < ch.length; i++) {
           swap(ch,i,fi);
           permutation(ch,fi+1);
           swap(ch,i,fi);
        }
    }
    public static void swap(char[] ch, int i, int fi){
        char temp = ch[i];
        ch[i] = ch[fi];
        ch[fi] = temp;
    }
}
