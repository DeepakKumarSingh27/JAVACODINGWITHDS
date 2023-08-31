package RaghuSirHomePractic.NumberSystem;

public class pro36 {
    public static void main(String[] args) {
        int n = 23456789;
        int ct=0;
       do {
           int d = n%10;
           if (d==2||d==3||d==5||d==7)
               ct++;
           n/=10;
       }while (n!=0);
        System.out.println(ct);
    }
}
