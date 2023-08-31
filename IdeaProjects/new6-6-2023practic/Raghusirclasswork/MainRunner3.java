package Raghusirclasswork;

import java.util.Stack;

public class MainRunner3 {
    public static void main(String[] args) {
        System.out.println(decToBin(21));
    }

    public static int decToBin(int n) {
        Stack<Integer> stk = new Stack<Integer>();
        do {
            int b= n%2;
            stk.push(b);
            n=n/2;
        }while (n!=0);
        int bin = 0;
        while (stk.isEmpty()==false){
            bin=bin*10+stk.pop();
        }
        return bin;
    }
}
