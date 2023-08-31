package NumberSystem;
import java.util.Scanner;
public class Pro9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int sum=0,temp=n;
        int d1=n%10;
        int d2=n/10;
         sum =d1+d2+d1*d2;
        if (sum==temp)
            System.out.println(n+" is special 2 digit number");
        else
            System.out.println(n+" is not special 2 digit number");

    }
}
