package ArraysOneDimension;
import java.util.Scanner;
public class Arr9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("enter " + n + " values ");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        int x = countPrime(ar);
        System.out.println(x);
    }
    static int countPrime(int[] ar) {
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            boolean rs = isPrime(ar[i]);
            if (rs==true)
                count++;
        }
        return count;
    }

    static boolean isPrime(int x) {
        {
            for (int j = 2; j <= x / 2; j++)
            {
                if (x % j == 0)
                    return false;
            }
            return true;
        }
    }
}
