package KunalSir.Maths;
public class MagicNumber {
    public static void main(String[] args) {
        int n = 5;
        int base = 5;
        int ans = 0;
        while (n > 0) {
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base = base * 5;
        }
        System.out.println(ans);
       //  binaryNumber(m);
    }

//    static void binaryNumber(int n) {
//        int bin = 0, p = 1;
//        do {
//            int r = n % 2;
//            bin = bin + r * (int) Math.pow(5, p);
//            p++;
//            n /= 2;
//        } while (n != 0);
//        System.out.println(bin);

//    }
}