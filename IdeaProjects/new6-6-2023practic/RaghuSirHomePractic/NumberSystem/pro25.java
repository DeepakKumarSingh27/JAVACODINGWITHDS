package RaghuSirHomePractic.NumberSystem;

import java.util.Scanner;

public class pro25 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int sum =0,t=n;
        for (int i = 1; i <=n/2 ; i++) {
            if (n%2==0){
                sum+=i;
            }
        }
        if (sum==t){
            System.out.println("perfect");
        } else {
            System.out.println("not perfect");
        }
    }
}
