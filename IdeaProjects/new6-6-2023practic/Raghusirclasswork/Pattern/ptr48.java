package Raghusirclasswork.Pattern;
import java.util.Scanner;
public class ptr48 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (j==1||j==n||(i==j||i+j==n+1)&&i>=n/2+1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
