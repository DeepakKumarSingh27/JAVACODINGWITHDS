package Raghusirclasswork.groomingsessionQuestions;
import java.util.Scanner;
public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the word");
        String st = sc.nextLine();
        System.out.println(st);
        System.out.println("which sentence you want to replace");
//        char c = sc.next().charAt(0);
        String st1 = sc.nextLine();
        System.out.println("Enter replacing character ");
//        char ch= sc.next().charAt(0);
        String st2= sc.nextLine();
        String t="";
        for (int i = 0; i < st.length(); i++) {
//            if (st.charAt(i)=="st2"){
//                t=t+st2;
//            }else {
//                t=t+st.charAt(i);
//            }
        }
        System.out.println(t);
    }
}
