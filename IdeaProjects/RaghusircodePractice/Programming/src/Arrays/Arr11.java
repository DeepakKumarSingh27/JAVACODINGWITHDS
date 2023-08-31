package Arrays;
import java.util.Scanner;
public class Arr11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" values");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int[] ct=count(arr);
        System.out.println("Sum of even Element is "+ct[0]);
        System.out.println("Sum of odd Element is "+ct[1]);

    }
    static int[] count(int[] arr) {
        int esum=0,osum=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                esum+=arr[i];
            }else {
                osum+=arr[i];
            }
        }
        int[] ct={esum,osum};
        return ct;
    }
}
