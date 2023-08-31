package NUMBERSYSTEM;

public class Pro50 {
    public static void main(String[] args) {
        System.out.println(countDigit(12345));
    }
    static int countDigit(int n) {
        int count=0;
        do {
            count++;
            n/=10;
        }while (n!=0);
        return count;
    }
}
