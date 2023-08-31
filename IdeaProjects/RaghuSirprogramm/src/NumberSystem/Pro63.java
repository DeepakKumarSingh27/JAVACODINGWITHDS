package NumberSystem;
import java.util.Scanner;
public class Pro63 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        printNPrime(n);
    }
    static void printNPrime(int n)
    {
        for (int i=1;n>0;i++) //10
        {
            boolean rs=isPrime(i);//1 2 3 5 7
            if (rs==true)
            {
                System.out.print(i + " ");
                n--;//10,9,8,7 6
            }
        }
    }
   public static boolean isPrime(int x)
    {
       for (int j=2;j<=x/2;j++)
       {
           if (x%j==0)
               return false;
       }
       return true;
    }
}
