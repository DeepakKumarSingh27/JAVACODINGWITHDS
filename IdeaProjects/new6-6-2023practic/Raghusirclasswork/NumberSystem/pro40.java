package Raghusirclasswork.NumberSystem;
import java.util.Scanner;
public class pro40 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int esum=0,osum=0;
        do {
            int r = n%10;
            if (r%2==0)
                esum+=r;
            else
                osum+=r;
            n/=10;
        }while (n!=0);
        System.out.println(esum+" "+osum);
    }
}
