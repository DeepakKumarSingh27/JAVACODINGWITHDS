package NumberSystem;
import java.util.Scanner;
public class Pro75 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int f1=0,f2=1;
        while (n>0)
        {
            System.out.print(f1+" ");
            int f3=f1+f2;
            f1=f2;
            f2=f3;
            n--;
        }
    }
}
