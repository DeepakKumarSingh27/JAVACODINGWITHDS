package Assignment6;
import java.util.Scanner;
public class pro1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int x=squareRoot(n);
        System.out.println(x);
    }
    public static int squareRoot(int x) {
        int start = 1;
        int end = x;
        int ans = 0;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == x) {
                ans = mid;
                break;
            } else if (mid * mid < x) {
                start = mid + 1;
                ans = mid;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
