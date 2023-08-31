package NumberSystem;

import java.util.Scanner;

public class Pro9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the NUmber");
        int n=sc.nextInt();
        int temp=n,sum=0;
        int d1=n%10;
        int d2=n/10;
        sum=sum+d1+d2+d1*d2;
        if (sum==temp)
        {
            System.out.println(n+" is special 2 Digit ");
        }
        else {
            System.out.println(n+" is  not special 2 Digit ");

        }
    }
}
