package KunalsirAssignment1;
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number ");
        int a=sc.nextInt();
        System.out.println("Enter second Number");
        int b=sc.nextInt();
        if (a>b)
        {
            System.out.println(a+" is Biggest");
        }
        else
        {
            System.out.println(b+" is Biggest");
        }
    }
}
