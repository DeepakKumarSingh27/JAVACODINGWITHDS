package NumberSystem;
import java.util.Scanner;
public class Pro51 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int ct=countDigit(n);
System.out.println("Digits present in the umber is "+ct);
    }
    static int countDigit(int n)
    {
        int count=0;
       do {
           n/=10;
           count++;
       }while (n!=0);
       return count;
    }
}
