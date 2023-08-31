package KSirDataStructure.Assignment10;
public class GCD_LCM {
    public static void main(String[] args) {

        System.out.println(gcd(120,72));
        System.out.println(lcm(12,8));
    }
    public static int gcd(int a,int b){
        if (a == 0){
            return b;
        }
        return gcd(b%a,a);
    }
    public static int lcm(int a,int b){

        return a*b/gcd(a,b);
    }
}
