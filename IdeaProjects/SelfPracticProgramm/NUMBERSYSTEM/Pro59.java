package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        PrintNPrime(n);
    }
    static void PrintNPrime(int n)
    {
        for (int i=1;n>0;i++)
        {
            boolean rs=isPrimSum(i);
            if (rs==true)
            {
                System.out.print(i+" ");
                n--;
            }
        }
    }

    static boolean isPrimSum(int x)
    {
        for (int j=2;j<=x/2;j++)
        {
            if (x%j==0)
                return false;
        }
        return true;
    }
}
