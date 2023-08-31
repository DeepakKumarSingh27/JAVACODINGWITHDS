package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro63 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int count=0;
        for (int i=1;i<n;i++)
        {
            boolean rs=isSpecial2Digit(i);
            if (rs==true)
                count++;
        }
        System.out.println(count);
    }
    static boolean isSpecial2Digit(int n)
    {
        int sum=0,temp=n;
        int d1=n%10;
        int d2=n/10;
        sum=d1+d2+d1*d2;
        return sum==temp;
    }
}
/*

 */