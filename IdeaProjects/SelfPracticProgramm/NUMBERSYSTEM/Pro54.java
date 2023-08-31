package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro54 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        boolean rs=isHappy(n);
        if (rs==true)
            System.out.println(n+" is Happy Number");
        else
            System.out.println(n+" is Not Happy Number");
    }
    static boolean isHappy(int n) //97
    {
      while (n>9)
      {
          n=sumofSquareofDigit(n);
      }
      return n==1 ||n==7;
    }

    static int sumofSquareofDigit(int n)
    {
        int sum=0;
        do {
            int d=n%10;
            sum=sum+d*d;
            n=n/10;
        }while (n!=0);
        return sum;
    }
}
