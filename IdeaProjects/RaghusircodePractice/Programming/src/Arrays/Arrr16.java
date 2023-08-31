package Arrays;
import java.util.Scanner;
public class Arrr16 {
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
        boolean[] rs = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (rs[i]==false)
            {
                int count = 1;
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[i]==arr[j])
                    {
                        count++;
                        rs[j] = true;
                    }
                }
                System.out.println(arr[i]+" ----> "+ count);
            }
        }
    }
}
