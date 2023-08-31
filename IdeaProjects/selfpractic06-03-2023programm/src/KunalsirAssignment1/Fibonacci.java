package KunalsirAssignment1;
public class Fibonacci {
    public static void main(String[] args) {
        int n=4;
       int f1=0,f2=1;
       while (n>0)
       {
           System.out.print(f1+" ");
           int f3=f1;
           f1=f2;
           f2=f3;
           n--;
       }
    }
}
