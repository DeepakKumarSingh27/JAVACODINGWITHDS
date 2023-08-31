package NumberSystem;
import java.util.Scanner;
public class Pro47 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int pro=isProduct(n);
        System.out.println("Product of Digit is "+pro);
    }
    static int isProduct(int n)
    {
        int pro=1;
        do {
            int d=n%10;
            pro*=d;
            n=n/10;
        }while (n!=0);
        return pro;
    }
}
