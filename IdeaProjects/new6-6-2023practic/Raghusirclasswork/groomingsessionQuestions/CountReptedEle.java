package Raghusirclasswork.groomingsessionQuestions;
import java.util.Scanner;
public class CountReptedEle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the word");
        String st = sc.next();
        int[] ch= new int[128];
        int count =0;
        for (int i = 0; i < st.length(); i++) {
          ch[st.charAt(i)]++;
        }
        for (int i = 0; i <ch.length; i++) {
            if (ch[i]>1)
                count++;
        }
        System.out.println(count);
    }
}
