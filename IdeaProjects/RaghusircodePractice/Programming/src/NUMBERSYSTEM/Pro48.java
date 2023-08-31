package NUMBERSYSTEM;
public class Pro48 {
    public static void main(String[] args) {
        int n=28;
        boolean rs = isPerfect(n);
        if (rs)
            System.out.println(n+" is perfect Number");
        else
            System.out.println(n+" is not perfect Number");
    }
    static  boolean isPerfect(int n)
    {
       int sum=0,temp=n;
        for (int i = 1; i <= n/2; i++) {
            if (n%i==0)
                sum+=i;
        }
       return sum==temp;
    }
}
