package NumberSystem;
import java.util.Scanner;
public class Pro36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
       int count=0;
       while (n!=0)
       {
         int d=n%10;
         count++;
         n=n/10;
       }
System.out.println("Digits present are "+count);
    }
}
