package RaghuSirHomePractic.NumberSystem;

import java.util.Scanner;

public class pro9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int t = a;
        int d1= a%10;
        int d2 = a/10;
        int si = d1+d2+d1*d2;
        if (si == t){
            System.out.println("sp");
        }else {
            System.out.println("not sp");
        }

    }
}
