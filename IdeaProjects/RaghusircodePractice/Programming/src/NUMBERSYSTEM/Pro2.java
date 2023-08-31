package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radios");
        int r=sc.nextInt();
        System.out.println("Radios is "+r);
        System.out.println("Area is "+2*3.14*r*r);
        System.out.printf("%s.3f","Area is "+2*3.14*r);

    }
}
