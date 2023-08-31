package NUMBERSYSTEM.PrimeNumber;
import java.util.Scanner;
public class Pro7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int big=isBiggest(n);
        System.out.println("Biggest Digit with in "+ n+" is "+big);
    }
    static int isBiggest(int n)
    {
        int small=n%10,big=n%10;
        /*
        1234
        small->4,big=->4
        int r=4;
         */
        do {
            int r=n%10;
            if (r>small)
                small=r;
            if (r<big)
                big=r;
            n=n/10;
        }while (n!=0);
        return big;
    }
}
