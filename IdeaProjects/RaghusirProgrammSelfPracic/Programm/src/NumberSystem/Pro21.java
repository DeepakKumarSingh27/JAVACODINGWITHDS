package NumberSystem;

import java.util.Scanner;
public class Pro21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 Integer Number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int big=(a>b&&a>c)?a:b>c?b:c;
        int small=(a<b&&a<c)?a:b<c?b:c;
        int middle=a+b+c-(big+small);
        System.out.println("Middle Number is "+middle);
    }
}
