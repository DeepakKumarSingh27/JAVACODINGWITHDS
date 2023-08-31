package Assignment6;
public class Pro2 {
    public static void main(String[] args) {
        int num =5 ;
        boolean rs=isPerfectSquare(num);
        if (rs==true) {
            System.out.println(rs);
        }
        else {
            System.out.println(rs);
        }
    }
    public static boolean isPerfectSquare(int num) {
      int ld = num % 10;
      if (ld == 2 || ld == 3 || ld == 7 || ld == 8)
          return false;
      int l = 1;
      int r = num;
      while (l <= r){
          long mid = l + (r - l) / 2;
          long sq = mid * mid;
          if (sq == num)
              return true;
          else if (sq < num)
              l = (int)mid + 1;
          else
              r = (int)mid - 1;
      }
      return false;
    }
}
/*
Input: num = 16
Output: true
Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
 */