package KunalsirAssignment2;
public class Pro21 {
    public static void main(String[] args) {
        int n=10;
        int f1=0,f2=1;
//        while (n>0)
//        {
//            System.out.print(f1+" ");
//            int f3=f1+f2;
//            f1=f2;
//            f2=f3;
//            n--;
//        }
        while (n>=1)
        {
            System.out.print(f1+" ");
            int f3=f1+f2;
            f1=f2;
            f2=f3;
            n--;
        }
    }
}
