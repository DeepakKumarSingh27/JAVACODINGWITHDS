package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int cout=1;
        for(int i=1;i<=n/2;i++)
        {
            if (n%i==0)
                cout++;
        }
        if (cout==2)
            System.out.println(n+" is prime number");
        else
            System.out.println(n+" is not prime number");
    }
}
