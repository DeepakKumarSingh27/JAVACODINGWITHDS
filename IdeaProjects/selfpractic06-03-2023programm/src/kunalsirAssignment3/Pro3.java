package kunalsirAssignment3;
import java.util.Scanner;
public class Pro3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int sum=0,count=0;
        for (int i=1;i<=n;i++)
        {
            sum+=i;
            count++;
        }
        System.out.println("Average of number is "+sum/count);
    }
}
