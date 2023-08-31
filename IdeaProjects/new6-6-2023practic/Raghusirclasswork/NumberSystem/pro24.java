package Raghusirclasswork.NumberSystem;
import java.util.Scanner;
public class pro24 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter four subject marks");
        int p = sc.nextInt();
        int c= sc.nextInt();
        int m = sc.nextInt();
        int b = sc.nextInt();
        if (p<35||c<35 ||m < 35 || b<35)
            System.out.println("fail");
        else {
            double per= (p+c+m+b)/4.0;
            if (per >= 85)
                System.out.println("Distinction");
            else if (per >=60)
                System.out.println("first class");
            else if (per >=50)
                System.out.println("second class");
            else System.out.println("pass");
        }
    }
}
