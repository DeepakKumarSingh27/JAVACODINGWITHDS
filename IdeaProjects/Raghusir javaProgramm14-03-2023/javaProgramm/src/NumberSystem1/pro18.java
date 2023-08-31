package NumberSystem1;

import java.util.Scanner;

public class pro18 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int y= sc.nextInt();
        if (y%400==0&&y%100!=0||y%4==0) System.out.println(y+" is leap year");
        else System.out.println(y+" is not leap year");
    }
}
