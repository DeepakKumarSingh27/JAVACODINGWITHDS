package NUMBERSYSTEM.PrimeNumber;
import java.util.Scanner;
public class pro1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        boolean rs=isPrime(n);
        if (rs==true)
            System.out.println(n+" is prime number");
        else
            System.out.println(n+ " is not prime number");
    }

     static boolean isPrime(int n)
     {
         for (int i=2;i<=n/2;i++)
         {
             if (n%i==0)
                 return false;
         }
         return true;
    }
}
