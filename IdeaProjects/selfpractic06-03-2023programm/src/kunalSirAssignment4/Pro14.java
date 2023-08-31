package kunalSirAssignment4;
import java.util.Scanner;
public class Pro14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int n=sc.nextInt();
        int sum=0;
        for (int i=1;n>0;i++)
        {
            sum=isSum(i);
            n--;
        }
        System.out.println(sum);
    }
    static int isSum(int n) {
        int sum=0;
        for (int i=1;i<=n;i++)
        {
            sum+=i;
        }
        return sum;
    }
}
