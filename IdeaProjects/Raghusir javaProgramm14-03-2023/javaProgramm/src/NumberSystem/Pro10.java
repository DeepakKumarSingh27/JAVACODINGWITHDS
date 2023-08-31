package NumberSystem;

import java.util.Scanner;

public class Pro10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nUmber");
        int n=sc.nextInt();
        if (n<0)
            System.out.println(n+" is Negative Number");
        else
            System.out.println(n+" is positive Number");
    }
}
