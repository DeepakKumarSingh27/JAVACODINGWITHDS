package KunalSir.Recursion;
public class Rec1 {
    public static void main(String[] args) {
        int n = 5;
      //  System.out.println(function(n));
        //funBoth(n);
       int ans = fact(n);
        System.out.println(ans);
    }
    public static void function(int n){
        if (n == 0){
            return;
        }
        System.out.print(n+" ");
        function(n - 1);
    }
    public static void funRev(int n){
        if (n == 0){
            return;
        }
        funRev(n - 1);
        System.out.print(n+" ");
    }
    public static void funBoth(int n){
        if (n == 0){
            return;
        }
        System.out.print(n+" ");
        funBoth(n - 1);
        System.out.print(n+" ");
    }
    public static int fact(int n)
    {
        if (n <= 1){
            return 1;
        }
        return n * fact(n - 1);
    }
}
