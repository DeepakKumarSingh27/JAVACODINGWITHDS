package KSirDataStructure.Pattern;
public class ptr {
    public static void main(String[] args) {
        int n =5;
      Pattern30(n);
    }
    static void Pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern3(int n) {
        for (int i = 1; i  <=n; i++) {
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void Pattern4(int n) {
        for (int i = 1; i  <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void Pattern5(int n) {
        for (int i = 1; i <= 2*n; i++) {
            int c = i>n ? 2*n-i:i;
            for (int j = 1; j <=c ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern28(int n) {
        for (int i = 1; i <= 2*n; i++) {
            int c = i>n ? 2*n-i:i;
            int sp =n-c;
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=c ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern30(int n) {
        for (int i = 1; i <= n; i++) {
            int c = i>n ? 2*n-i:i;
            int sp =n-c;
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=c ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
