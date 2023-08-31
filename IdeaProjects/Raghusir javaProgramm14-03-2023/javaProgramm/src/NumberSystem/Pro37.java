package NumberSystem;
import java.util.Scanner;
public class Pro37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int edig=0,odig=0;
        do {
            int d = n % 10;
            if (d % 2 == 0){
                edig++;
            }else {
                odig++;
            }
            n /= 10;
        }while (n != 0);
        System.out.println("Even Digits are "+edig);
        System.out.println("odd Digits are "+odig);
    }
}
