package RaghuSirAssignments;
import java.util.Scanner;
public class pro2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" values");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
       int ct = countStrong(arr);
        System.out.println(ct);
    }

    public static int countStrong(int[] arr) {
        int ct =0;
        for (int i = 0; i < arr.length; i++) {
            boolean rs = isStrong(arr[i]);
            if (rs) {
                ct++;
            }
        }
        return ct;
    }

    public static boolean isStrong(int x) {
        int sum=0,temp=x;
        do {
            int d= x%10;
            sum+=getFact(d);
            x/=10;
        }while (x!=0);
        return sum==temp;
    }

    public static int getFact(int n) {
        int fact =1;
        while (n>1) {
            fact *= n;
            n--;
        }
        return fact;
    }
}
