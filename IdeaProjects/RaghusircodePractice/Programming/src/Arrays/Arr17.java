package Arrays;
import java.util.Scanner;
public class Arr17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter "+n+" values");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
        findFreq(n);
    }
    static void findFreq(int n) {
        int[] count =new int[10];
        do {
            int r=n%10;
            count[r]++;
            n/=10;
        }while (n!=0);
        for (int i = 0; i <= 9 ; i++) {
            if (count[i]!=0){
                System.out.println(i+" ----> "+count[i]);
            }
        }
    }
}
