package NumberSystem1;
import java.util.Scanner;
public class pro21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three number");
        int a=sc.nextInt();
        int b = sc.nextInt();
        int c= sc.nextInt();
        int mid = 0;
        System.out.println("middle number is "+(a+(c-a)/2));
    }
}
