package NumberSystem;

import java.util.Scanner;

public class Pro3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if (n<0)
        {
            n=n* -1;
        }
        System.out.println("Positive number is "+n);
    }
}
