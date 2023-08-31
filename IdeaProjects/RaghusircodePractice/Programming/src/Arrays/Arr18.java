package Arrays;
import java.util.Scanner;
public class Arr18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" values");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        findFreq(arr);
    }
    static void findFreq(int[] arr) {
        int big=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]> big)
            {
                big= arr[i];
            }
        }
        int[] count = new int[big+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i]!=0)
            {
                System.out.println(i+" ---> "+count[i]);
            }
        }
    }
}
