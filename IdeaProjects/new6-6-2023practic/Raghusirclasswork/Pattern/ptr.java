package Raghusirclasswork.Pattern;
import java.util.Scanner;
/*
 * * * * * * * * *
 * * * * * * *
 * * * * *
 * * *
 *
 * * *
 * * * * *
 * * * * * * *
 * * * * * * * * *

 */
public class ptr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int sp=0,st=n;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=sp ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=st ; j++) {
                System.out.print("* ");
            }
            if (i<=n/2) {
                st=st-2;
                sp++;
            } else {
                st=st+2;
                sp--;
            }
            System.out.println();
        }
    }
}
