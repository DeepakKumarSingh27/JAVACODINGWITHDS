package NumberSystem;

import java.util.Scanner;

public class Pro5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temp in cal ");
        int cal=sc.nextInt();
        int fran=(cal*9)/5+32;
        System.out.println("temp in faranhite is "+fran);
    }
}
