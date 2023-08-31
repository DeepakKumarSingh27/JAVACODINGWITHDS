package NumberSystem;
import java.util.Scanner;
public class Pro2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radios of circle");
        double r=sc.nextDouble();
        System.out.println("Radios of circle is "+r);
        System.out.println("Area of circle is "+3.14*r*r);
        System.out.println("circumference of circle is "+2*3.14*r);
    }
}
