package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principle time and rate");
        int p =sc.nextInt();
        int t=sc.nextInt();
        int r=sc.nextInt();
        int si=p*r*t/100;
        System.out.println(si);
    }
}
