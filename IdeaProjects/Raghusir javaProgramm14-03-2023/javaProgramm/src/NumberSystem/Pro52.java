package NumberSystem;
import java.util.Scanner;
public class Pro52 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        System.out.println("Enter the power");
        int p=sc.nextInt();
        ispower(n,p);
    }

    private static void ispower(int n, int p) {
        int pow=1;
        while (p>0){
            pow*=n;
            p--;
        }
        System.out.println(pow);
    }
}
