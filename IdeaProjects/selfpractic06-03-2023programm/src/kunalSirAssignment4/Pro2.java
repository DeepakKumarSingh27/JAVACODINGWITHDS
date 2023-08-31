package kunalSirAssignment4;
import java.util.Scanner;
public class Pro2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        findEvenOdd(n);
    }
    static void findEvenOdd(int n)
    {
      if (n%2==0)
          System.out.println(n+" is Even");
      else
          System.out.println(n+" is Odd");
    }
}
