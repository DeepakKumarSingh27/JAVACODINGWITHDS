package NumberSystem;
import java.util.Scanner;
public class Pro2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radius:");
        int r=sc.nextInt();
        System.out.println("Radius is: "+r);
        System.out.println("Area is; "+3.14*r*r);
        System.out.println("Circumference is "+2*3.14*r);
    }
}
