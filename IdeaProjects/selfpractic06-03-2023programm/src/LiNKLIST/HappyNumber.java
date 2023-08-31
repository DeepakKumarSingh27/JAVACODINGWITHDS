package LiNKLIST;
public class HappyNumber {
    public static void main(String[] args) {
   int x = 19;
   boolean rs = isHappy(x);
   if (rs)
       System.out.println(rs);
   else
       System.out.println(rs);
    }
    public static boolean isHappy(int n) {
     int sum = 0;
     while (n > 9) {
        n = isSum(n);
     }
     return n==1 || n==7;
    }

    public static int isSum(int n) {
        int sum = 0;
        do {
            int d = n % 10;
            sum += d*d;
            n /= 10;
        } while (n != 0);
        return sum;
    }
}
