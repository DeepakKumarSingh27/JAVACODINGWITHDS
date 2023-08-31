package KunalsirAssignment2;

import java.util.Scanner;

public class Pro14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radios");
        int r=sc.nextInt();
        System.out.println("Enter the height");
        int h=sc.nextInt();
        System.out.println("Volume Of Cone is "+(1*h*3.14*r*r)/3);
    }
}
