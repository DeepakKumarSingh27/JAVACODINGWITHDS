package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro55 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        boolean rs=isHappy(n);
        if (rs==true)
        System.out.println(n+" is Happy Number");
        else
            System.out.println(n+" is unHappy");

    }
    static boolean isHappy(int n) {
        while (n > 9)
        {
            n=SumofDigits(n);
        }
        return n == 1 || n == 7;
    }
    static int SumofDigits(int n) {
      int sum =0;
      do {
          int d= n%10;
          sum+=d*d;
          n/=10;
      }while (n!=0);
      return sum;
    }
}
