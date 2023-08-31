package KSirDataStructure.Assignment10;
public class PowerOFThree {
    public static void main(String[] args) {
     int n = 5;
        System.out.println(isPowerOfThree(n));
    }
    public static boolean isPowerOfThree(int n) {
    while (n >= 4) {
        if (n%4 != 0) return false;
        n/=4;
    }
    return n==1;
    }
}
