package kunalsirAssignment3;

import java.util.Scanner;

public class Pro13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
