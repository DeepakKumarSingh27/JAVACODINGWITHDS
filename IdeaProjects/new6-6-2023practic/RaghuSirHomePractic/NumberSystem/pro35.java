package RaghuSirHomePractic.NumberSystem;

public class pro35 {
    public static void main(String[] args) {
        int n =12345;
        int sum =0;
        do {
            sum +=n%10;
            n/=10;
        }while (n!=0);
        System.out.println(sum);
    }
}
