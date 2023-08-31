package Arrays;
import java.util.Scanner;
public class Arr9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int[] arr = new int[n];
        int count=0;
        System.out.println("Enter "+n+" values");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            boolean rs= isPrime(arr[i]);
            if (rs==true){
                count++;
            }
        }
        System.out.println("Prime Number present in Array is "+count);
    }
    static boolean isPrime(int x) {
        for (int i = 2; i <= x/2; i++) {
            if (x%i==0){
                return false;
            }
        }
        return true;
    }
}
