package KSirDataStructure.Recursion;

public class pro1 {
    public static void main(String[] args) {
        int n = 4;
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            if (n % i == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
