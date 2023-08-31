package NumberSystem;
import java.util.Scanner;
public class Pro68 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        String bin=dectoBin(n);
        System.out.println("Decimal to Binary is: "+bin);
    }
    static String dectoBin(int n)
    {
        String bin=" ";
        do {
            int d=n%2;
            bin=d+bin;
            n=n/2;
        }while (n!=0);
        return bin;
    }
}
