package RaghuSirAssignments;
import java.util.Scanner;
public class pro1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" values");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int count = countPalindrome(arr);
        System.out.println(count);
    }

    public static int countPalindrome(int[] arr) {
        int count =0;
        for (int i = 0; i <arr.length ; i++) {
            boolean rs = isPalindrome(arr[i]);
            if (rs == true) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPalindrome(int x) {
        int rev =0,temp=x;
        do {
            int d= x%10;
            rev=rev*10+d;
            x/=10;
        }while (x!=0);
        return rev== temp;
    }
}
