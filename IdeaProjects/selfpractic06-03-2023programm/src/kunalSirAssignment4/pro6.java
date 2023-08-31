package kunalSirAssignment4;
import java.util.Scanner;
public class pro6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radios");
        int r=sc.nextInt();
        printDetailsCircle(r);
    }
    static void printDetailsCircle(int r) {
        System.out.println("circumference is "+2*3.14*r);
        System.out.println("Area is "+3.14*r*r);
    }
}
