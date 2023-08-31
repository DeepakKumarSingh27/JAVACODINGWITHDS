package NumberSystem;
import java.util.Scanner;
public class pro51 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int sum=sumOfNatNum(n);
        System.out.println("sum of natural number is: "+sum);
    }
    static int sumOfNatNum(int n)
    {
        int sum=0;
        do {
           // int d=n%10;
            sum=sum+n;
            n--;
        }while (n!=0);
        return sum;
    }
}
