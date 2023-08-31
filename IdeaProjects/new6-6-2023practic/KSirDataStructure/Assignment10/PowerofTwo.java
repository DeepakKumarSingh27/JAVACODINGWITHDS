package KSirDataStructure.Assignment10;
public class PowerofTwo {
    public static void main(String[] args) {
        int n = 45;
        boolean rs = isPowerOfTwo(n);
        if (rs)
            System.out.println(true);
        else
            System.out.println(false);
    }
    public static boolean isPowerOfTwo(int n) {
//        int x = (int) Math.pow(2,n);
//        System.out.println(x);
//        if (x%2==0)
//         return true;
//        else
//            return false;
      if (n < 1)
          return false;

      if (n == 1)
          return false;
      if (n % 3 == 0)
          return true;
      return (isPowerOfTwo(n/3));
    }
}
