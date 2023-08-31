package NumberSystem;
import java.util.Scanner;
public class Pro45 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ente the number");
        int n=sc.nextInt();
        int fact=1;
        for (int i=1;i<=n;i++)
        {
            fact*=i;
        }
    System.out.println("factorial of "+n+" is "+fact);
    }
}
