package Raghusirclasswork.OneDArray;
import java.util.Scanner;
public class arr11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] x= sumofOddEven(arr);
        System.out.println("Sum is even "+x[0]);
        System.out.println("sum od odd "+x[1]);

    }

    public static int[] sumofOddEven(int[] arr) {
        int esum=0,osum=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                esum+=arr[i];
            } else {
                osum+=arr[i];
            }
        }
        int[]ct={esum,osum};
        return ct;
    }
}
