package NumberSystem;
import java.util.Scanner;
public class Pro37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int ec=0,oc=0;
        do
        {
            int d=n%10;
            if (d%2==0)
                ec++;
            else
                oc++;
            n=n/10;
        }while(n!=0);
        System.out.println("Even digits are "+ec);
        System.out.println("odd digits are "+oc);
    }
}
