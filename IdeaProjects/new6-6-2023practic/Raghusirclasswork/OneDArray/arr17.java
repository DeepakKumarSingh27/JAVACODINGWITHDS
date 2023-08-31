package Raghusirclasswork.OneDArray;
import java.util.Scanner;
public class arr17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        countDigits(n);
    }

    public static void countDigits(int n) {
        int[] count= new int[10];
        do {
            int d= n%10;
            count[d]++;
            n/=10;
        }while (n!=0);
        for (int i = 0; i < count.length; i++) {
            if (count[i]!=0){
                System.out.println(i+" ----> "+count[i]);
            }
        }
    }
}
