package KunalSir.Pattern;
public class Ptr1 {
    public static void main(String[] args) {
        pattern31(5);
    }

    static void pattern2(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = i; j >0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n) {

        for (int row = n; row > 0; row--) {
            for (int col = row; col > 0; col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n) {

        for (int row = 0; row < 2 * n; row++) {
            int k = row > n ?  2 * n - row: row;
            for (int col = 0; col < k; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern28(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int k = row > n ?  2 * n - row: row;
            int noOfSpaces = n - k;
            for (int s = 0; s <noOfSpaces; s++){
                System.out.print(" ");
            }
            for (int col = 0; col < k; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern30(int n) {
        for (int row = 1; row <  n; row++) {
            for (int space = 0; space < n-row; space++) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--){
                System.out.print(col+" ");
            }
            for (int col = 2; col <= row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void pattern17(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int k = row > n ? 2 * n - row: row;
            for (int space = 0; space < n - k; space++) {
                System.out.print(" ");
            }
            for (int col = k; col >= 1; col--){
                System.out.print(col+" ");
            }
            for (int col = 2; col <= k; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void pattern31(int n){
        int original = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = original - Math.min(Math.min(row, col), Math.min(n - row, n -  col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
    static void  pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void  pattern6(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void  pattern7(int n){
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void  pattern8(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        for (int i = n; i >0 ; i--) {
            for (int j = 1; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern11(int n){
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
