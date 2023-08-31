package RaghuSirHomePractic.NumberSystem;

public class pro28 {
    public static void main(String[] args) {
        int n = 5;
        int esum=0,osum=0;
        for (int i = 1; i <=n ; i++) {
            if (i%2==0)
                esum+=i;
            else osum+=i;
        }
        System.out.println(esum+" "+osum);
    }
}
