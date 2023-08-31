package NumberSystem;

import java.util.Scanner;

public class Pro38 {
    public static void main(String[] args) {
     /*
     123->3
      */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numnber:");
        int n=sc.nextInt();
        int count =0;
        do {
            count++;
            n/=10;
        }while (n!=0);
        System.out.println("Digits in the number: "+count);
    }
}
