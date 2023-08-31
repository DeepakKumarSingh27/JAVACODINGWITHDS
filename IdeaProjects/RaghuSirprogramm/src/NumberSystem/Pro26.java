package NumberSystem;

import java.util.Scanner;

public class Pro26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        /*
        perfect number->28_>
        2,4,7,14=28
         */
        int per=0,temp=n;
        for (int i=1;i<=n/2;i++)
        {
            if (n%i==0) //1,2,4,7,14
              per=per+i;
        }
        if (per==temp)
            System.out.println(n+" is perfect number");
        else
            System.out.println(n+" is not a perfect number.");
    }
}
