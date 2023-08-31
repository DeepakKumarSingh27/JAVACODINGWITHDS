package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int small=(a<b&&a<b)?a:b<c?b:c;
        System.out.println("smallest number is "+small);

    }
}
