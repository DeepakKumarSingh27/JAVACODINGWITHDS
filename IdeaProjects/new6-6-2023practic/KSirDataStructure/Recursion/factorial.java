package KSirDataStructure.Recursion;
public class factorial {
    public static void main(String[] args) {

        System.out.println(fact(50));
    }
    public static int fact(int n) {
        if (n <= 1){
            return 1;
        }
        return n * fact(n-1);
    }
}
