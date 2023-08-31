package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int esum=0,osum=0;
        for (int i = 1; i <= n; i++) {
            if (i%2==0)
                esum+=i;
            else
                osum+=i;
        }
        System.out.println(esum);
        System.out.println(osum);
    }
}
