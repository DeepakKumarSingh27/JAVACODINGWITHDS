package RaghuSirHomePractic.NumberSystem;

public class pro44 {
    public static void main(String[] args) {
    int n = 5;
    factorial(n);
    }
    public static void factorial(int n){
        int fact =1;
        for (int i = 1; i <=n ; i++) {
            fact*=i;
        }
        System.out.println(fact);
    }
}
