package Raghusirclasswork;

import java.util.Scanner;
import java.util.Stack;

public class MainRunner2 {
    public static boolean isBalanced(String st) {
        Stack<Character> stk = new Stack<Character>();
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(')
                stk.push(ch);
        }
        return true;
    }
    public static void main(String[] args) {
        // String st = "{}{}()";
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String: ");
        String st = sc.next();

    }

}
