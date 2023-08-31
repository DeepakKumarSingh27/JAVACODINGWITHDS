package NumberSystem;
import java.util.Scanner;
public class Pro76 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int fib=nThFib(n);
        System.out.println(fib);
    }
    static int nThFib(int n)
    {
        int f1=0,f2=1;
        while (n>1)
        {
            int f3=f1+f2;
            f1=f2;
            f2=f3;
            n--;
        }
        return f1;
    }
}
