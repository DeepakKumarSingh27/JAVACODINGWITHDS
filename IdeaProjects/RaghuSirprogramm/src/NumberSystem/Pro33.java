package NumberSystem;

import java.util.Scanner;

public class Pro33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enert the number:");
        int n=sc.nextInt();
        int count=0;
        for (int i=1;i<=n;i++)
        {
            if (n%i==0)
            {
             count++;
            }
        }
        System.out.println("Diviser present in number: "+count);
    }
}
