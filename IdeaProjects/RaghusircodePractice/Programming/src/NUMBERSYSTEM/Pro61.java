package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro61 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        for (int i = 100; i <=999 ; i++) {
            boolean rs= isPalindrome(i);
            if (rs==true)
                System.out.println(i+" ");
        }
    }

    private static boolean isPalindrome(int n) {
        int pro=0,temp=n; // 121
        do {
            int d=n%10; //1 2 1
            pro=pro*10+d; //10+2 120+1=121
            n=n/10;
        }while (n!=0);
        return pro==temp;
    }
}
