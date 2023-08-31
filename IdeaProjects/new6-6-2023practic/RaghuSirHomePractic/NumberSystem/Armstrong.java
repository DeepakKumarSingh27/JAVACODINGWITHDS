package RaghuSirHomePractic.NumberSystem;

public class Armstrong {
    public static void main(String[] args) {
        int n = 153;
        int sum =0,t=n;
        do {
            int d = n%10;
            sum+=d*d*d;
            n/=10;
        }while (n!=0);
        if (sum==t)
            System.out.println("Armstrong");
        else
            System.out.println("not armstrong");
    }
}
