package NUMBERSYSTEM;

import java.util.Scanner;

public class Pro49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int dig=countDigit(n);
        System.out.println("Digit present in number is "+dig);
    }
    static int countDigit(int n)
    {
        int count=0;
        while (n!=0)
        {
            count++;
            n=n/10;
        }
        return count;
    }
}
