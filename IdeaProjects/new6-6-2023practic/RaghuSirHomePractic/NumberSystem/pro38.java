package RaghuSirHomePractic.NumberSystem;

public class pro38 {
    public static void main(String[] args) {
        int n = 1234;
        int sum =0;
        do {
            int d= n%10;
            sum+=d*d;
            n/=10;
        }while (n!=0);
        System.out.println(sum);
    }
}
