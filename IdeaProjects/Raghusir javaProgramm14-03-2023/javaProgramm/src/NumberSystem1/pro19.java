package NumberSystem1;

import java.util.Scanner;

public class pro19 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c= sc.nextInt();
        System.out.println("smallest number is "+((a<b&&a<c)?a:b<c?b:c));
    }
}
