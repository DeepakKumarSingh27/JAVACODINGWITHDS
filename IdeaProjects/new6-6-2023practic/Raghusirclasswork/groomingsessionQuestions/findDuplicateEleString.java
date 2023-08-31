package Raghusirclasswork.groomingsessionQuestions;
import java.util.Scanner;
public class findDuplicateEleString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the word");
        String st = sc.nextLine();
        int[] ct = new int[128];
        for (int i = 0; i < st.length(); i++) {
         ct[st.charAt(i)]++;
        }
        //find duplicate element
//        for (int i = 0; i < ct.length; i++) {
//            if (ct[i] > 1){
//                System.out.println((char) i);
//            }
//        }
        // find unique element in string
//        for (int i = 0; i < ct.length; i++) {
//            if (ct[i] == 1){
//                System.out.println((char) i);
//            }
//        }
        // frequency of  each character
        for (int i = 0; i < ct.length; i++) {
            if (ct[i] != 0){
                System.out.println((char) i+" ---> "+ct[i]);
            }
        }
    }
}
