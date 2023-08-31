package NumberSystem1;

import java.util.Scanner;

public class pro42 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int pro=0;
        do {
            int d=n %10;
            pro = pro*10+d;
            n/=10;
        }while (n !=0);
        System.out.println("Reverse of Number is "+pro);
    }
}
