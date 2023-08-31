package KunalSir.Recursion;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palin(121));
    }
    static boolean palin(int n){
        return n == rev(n);
    }
    static int rev(int n) {
        int temp =n,pro=0;
        do {
            int d= n%10;
            pro=pro*10+d;
            n/=10;
        }while (n!=0);
        return pro;
    }
}
