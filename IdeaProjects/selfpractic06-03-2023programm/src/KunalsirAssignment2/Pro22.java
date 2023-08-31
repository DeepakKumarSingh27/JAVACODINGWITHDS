package KunalsirAssignment2;
public class Pro22 {
    public static void main(String[] args) {
    int n=234;
       int ans= subtractProductAndSum(n);
        System.out.println(ans);
    }
    public static int subtractProductAndSum(int n)
    {
        int sum=0,pro=1,x=0;
        while (n!=0) {
            x = (pro *= n % 10) - (sum += n % 10);
            n /= 10;
        }
     return x;
    }
}
