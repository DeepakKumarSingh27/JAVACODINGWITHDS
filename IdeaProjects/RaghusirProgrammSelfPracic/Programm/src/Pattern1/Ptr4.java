package Pattern1;
import java.util.Scanner;
public class Ptr4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >=1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
