package Raghusirclasswork.groomingsessionQuestions;
import java.util.Scanner;
public class ReverseStringWordByWord {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence");
        String st= sc.nextLine();
        char ch[] = st.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            String temp="";
            int k =i;
            while (k<ch.length && ch[k]!=' '){
                temp=ch[k]+temp;
                k++;
            }
            System.out.print(temp);
            if (k<ch.length){
                System.out.print(" ");
            }
            i=k;
        }
    }
}
