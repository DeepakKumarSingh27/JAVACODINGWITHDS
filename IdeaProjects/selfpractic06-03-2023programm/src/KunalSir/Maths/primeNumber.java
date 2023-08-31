package KunalSir.Maths;
public class primeNumber {
    public static void main(String[] args) {
        int n = 40;
//   int count = 1;
//        for (int i = 2; i <= n/2; i++) {
//           if (n % i == 0){
//               count++;
//           }
//        }
//        if (count == 1){
//            System.out.println(n+" is prime Number");
//        }else {
//            System.out.println(n+" is Not Prime Number");
//        }
        for (int i = 2; i <= n; i++) {
            boolean rs = isPrime(i);
            if (rs == true) {
                System.out.print(i + " ");
            }
        }
    }
    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        for (int c = 2; c*c <= n; c++) {
            if (n%c==0){
                return false;
        }
        }
        return true;
    }
}
/*
 int c = 2;
        while (c*c <= n){
            if (n % c == 0){
                return false;
            }
            c++;
 */