package NumberSystem;

import java.util.Scanner;

public class Pro48 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        boolean rs=isperfect(n);
        if (rs){
            System.out.println(n+" is perfect number");
        }else {
            System.out.println(n+" is not perfect");
        }
    }
    static boolean isperfect(int n) {
        int sum=0,temp=n;
        for (int i = 1; i <= n/2; i++) {
            if (n%i==0){
                sum+=i;
            }
        }
        return sum==temp;
    }
}
