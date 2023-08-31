package KunalSir.Maths;
public class Power {
    public static void main(String[] args) {
//        int count = 0,temp = n;
//        do {
//            int r = n % 10;
//            if (r == 1){
//                count++;
//            }
//            n /= 10;
//        }while (n != 0);
//        if (count == 1){
//            System.out.println("power of 2");
//        }else {
//            System.out.println("not power of 2");
//        }
//       int n = 31;
//       boolean ans = (n & (n-1)) == 0;
//        System.out.println(ans);
     int base = 5;
     int power = 5;
     int ans = 1;
     while (power > 0){
         if ((power & 1) == 1){
            ans *= base;
         }
         base *= base;
         power = power >> 1;
     }
        System.out.println(ans);
    }
}
