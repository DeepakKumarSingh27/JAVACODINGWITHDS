package RaghuSirHomePractic.NumberSystem;

public class pro37 {
    public static void main(String[] args) {
    int n = 1234567;
    int ec=0,oc=0;
    do {
        int d = n%10;
        if (d%2==0)
            ec++;
        else
            oc++;
        n/=10;
    }while (n!=0);
        System.out.println(ec);
        System.out.println(oc);
    }
}
