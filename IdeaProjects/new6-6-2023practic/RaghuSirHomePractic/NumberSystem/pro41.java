package RaghuSirHomePractic.NumberSystem;

public class pro41 {
    public static void main(String[] args) {
        int n =1001010;
        int ct=0;
        do {
            int d=n%10;
            if (d==0)
                ct++;
            n/=10;
        }while (n!=0);
        System.out.println(ct);
    }
}
