package Raghusirclasswork.String;
import java.util.Scanner;
public class str7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String st = sc.next();
        String st1 ="AEIOUaeiou";
        int count=0;
        for (int i = 0; i <st.length() ; i++) {
            char ch= st.charAt(i);
            if (st1.indexOf(ch)==-1){
                count++;
            }
        }
        System.out.println(count);
    }
}
