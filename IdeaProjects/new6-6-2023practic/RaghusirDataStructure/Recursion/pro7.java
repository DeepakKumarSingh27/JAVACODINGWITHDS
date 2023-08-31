package RaghusirDataStructure.Recursion;

public class pro7 {
    public static void main(String[] args) {
        System.out.println(gcd(10,5));
        System.out.println(lcm(2,4));
    }

    public static int gcd(int a, int b) {
//        if (a == 0) {
//            return b;
//        }
//        return gcd(b%a,a);
        if (b > a) {
            return gcd(b,a);
        }
        if ( a % b == 0){
            return b;
        }
        return gcd(b%a,b);
    }
    public static int lcm(int a,int b) {
//        return a*b/gcd(a,b);
        if (a > b) {
            return lcm(a,b,b);
        } else {
            return lcm(b,a,a);
        }
    }
    public static int lcm(int m,int n,int prod){
        if (prod % m == 0){
            return prod;
        }
        return lcm(m,n,prod+n);
    }
}
