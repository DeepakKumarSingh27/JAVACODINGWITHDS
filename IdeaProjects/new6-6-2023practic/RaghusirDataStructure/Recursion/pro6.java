package RaghusirDataStructure.Recursion;
public class pro6 {
    public static void main(String[] args) {
        int rv = isReverse(123);
        System.out.println(rv);
    }
    public static int isReverse(int n) {
        return isReverse(0,n);
    }
    public static int isReverse(int rev,int n) {
        if (n == 0){
            return rev;
        }
        return isReverse(rev*10+n%10,n/10);
    }
}
