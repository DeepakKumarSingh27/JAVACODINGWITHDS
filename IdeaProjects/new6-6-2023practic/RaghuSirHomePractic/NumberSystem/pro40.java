package RaghuSirHomePractic.NumberSystem;

public class pro40 {
    public static void main(String[] args) {
       int n =123456;
       int esum=0,osum=0;
       do {
         int d = n%10;
         if (d%2==0)
             esum+=d;
         else
             osum+=d;
         n/=10;
       }while (n!=0);
        System.out.println(esum);
        System.out.println(osum);
    }
}