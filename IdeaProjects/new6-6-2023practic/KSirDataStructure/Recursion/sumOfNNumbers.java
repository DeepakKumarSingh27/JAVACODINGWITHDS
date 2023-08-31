package KSirDataStructure.Recursion;
public class sumOfNNumbers {
    public static void main(String[] args) {

        System.out.println(digitProduct(0));
    }
//    public static int sum(int n) {
//        if (n <= 1) {
//            return 1;
//        }
//        return n + sum(n-1);
//    }

//    public static int sumOfDigits(int n) {
//        if (n == 0){
//            return 0;
//        }
//        return n%10+sumOfDigits(n/10);
//    }
    public static int digitProduct(int n) {
        if (n%10 == n) {
            return n;
        }
        return (n%10) * digitProduct(n/10);
    }
}
