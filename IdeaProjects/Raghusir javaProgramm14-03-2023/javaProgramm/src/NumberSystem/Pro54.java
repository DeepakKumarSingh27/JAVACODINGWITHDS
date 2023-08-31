package NumberSystem;
import java.util.Scanner;
public class Pro54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int n = sc.nextInt();
      boolean rs =  happyOrUnHappy(n);
      if (rs)
          System.out.println(n+" is Happy Number");
      else
          System.out.println(n+" is Not Happy Number");
    }
    static boolean happyOrUnHappy(int n) {
        while (n > 9){
          n=sumofSqr(n);
        }
        return n == 1 || n == 7;
    }
    static int sumofSqr(int n) {
      int sum = 0;
      do {
          int d = n % 10;
          sum = sum + d * d;
          n /= 10;
      }while (n != 0);
      return sum;
    }
}
