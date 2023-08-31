package NumberSystem;
import java.util.Scanner;

import static NumberSystem.pro54.isDiserium;

public class pro64 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for (int i = 1; n >0 ; i++) {
            boolean rs = isDiserium(i);
            if (rs == true)
            {
                System.out.println(i);
                n--;
            }
        }
    }
}
