package KunalsirAssignment2;
import java.util.Scanner;
public class Pro24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
       while (true)
       {
           System.out.println("Enter the number");
           int n=sc.nextInt();
           sum+=n;
           if (n==0)
           {
               break;
           }
       }
        System.out.println("The total sum of number is "+sum);
    }
}
