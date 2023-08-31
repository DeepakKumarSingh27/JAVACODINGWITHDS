package kunalsirAssignment3;

import java.util.Scanner;

public class Pro4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marked product");
        double mp=sc.nextDouble();
        System.out.println("Enter the selling price");
        double sp=sc.nextDouble();
        double discount=mp-sp;
        System.out.println("Discount is "+(discount*100)/mp+"%");

    }
}
