package KSirDataStructure.LargeNumbers;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        int a = 30;
        int b = 67;
        BigInteger A = BigInteger.valueOf(33);
        BigInteger B = BigInteger.valueOf(33);
        BigInteger C = new BigInteger("23333344");
        BigInteger D = BigInteger.ONE;
        System.out.println();

        BigInteger s = A.add(B);
        System.out.println(s);
        BigInteger m = C.multiply(D);
        System.out.println(m);

        //System.out.println(Factorial.fact(100));
        double x = 0.03;
        double y = 0.04;
        double ans = y-x;
        System.out.println(ans);
        BigDecimal X = new BigDecimal("0.03");
        BigDecimal Y = new BigDecimal("0.04");
        BigDecimal ans1 = Y.subtract(X);
        System.out.println(ans1);
        BigDecimal a1 = new BigDecimal("45668868686.5885858");
        BigDecimal b1 = new BigDecimal("636363636.48888484");
        System.out.println(b1.add(a1));
    }
}

