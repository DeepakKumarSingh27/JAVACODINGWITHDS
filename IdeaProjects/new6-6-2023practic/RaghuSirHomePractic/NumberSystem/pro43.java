package RaghuSirHomePractic.NumberSystem;

public class pro43 {
    public static void main(String[] args) {
       int n =12299921;
       int sum =0,t=n;
       do {
           int d= n%10;
           sum=(sum*10)+d;
           n/=10;
       }while (n!=0);
       if (sum==t)
           System.out.println("palindrome");
       else
           System.out.println("not palindrome");
    }
}
