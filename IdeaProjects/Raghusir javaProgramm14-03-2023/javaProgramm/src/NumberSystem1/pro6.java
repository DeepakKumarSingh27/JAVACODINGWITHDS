package NumberSystem1;

import java.util.Scanner;

public class pro6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first Number");
        double n= sc.nextDouble();
        System.out.println("Enter the second number");
        double m=sc.nextDouble();
        System.out.println("Addition is "+(n+m));
        System.out.println("subtraction is "+(n-m));
        System.out.println("multiplication is "+n*m);
        System.out.println("division is "+(n/m));
    }
}
