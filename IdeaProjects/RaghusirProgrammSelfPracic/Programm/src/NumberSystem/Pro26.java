package NumberSystem;

import java.util.Scanner;

public class Pro26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextByte();
        int fact=1;
        for (int i=1;i<=n;i++)
        {
            fact*=i;
        }
        System.out.println("factorial is "+fact);
    }
}
