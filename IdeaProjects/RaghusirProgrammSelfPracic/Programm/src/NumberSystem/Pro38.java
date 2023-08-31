package NumberSystem;

import java.util.Scanner;

public class Pro38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int pc=0;
        do {
        int d=n%10;
        if (d==1||d==2||d==3||d==5||d==7)
            pc++;
        n=n/10;
        } while (n!=0);
        System.out.println("Number of Prime Digits is "+pc);
    }
}
