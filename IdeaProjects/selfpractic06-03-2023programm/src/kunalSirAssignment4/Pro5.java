package kunalSirAssignment4;
import java.util.Scanner;
public class Pro5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int pro = findProduct(a, b);
        System.out.println("product of two Integer number is " + pro);
    }
    static int findProduct(int a, int b) {
        int pro=a*b;
        return pro;
    }
    }
