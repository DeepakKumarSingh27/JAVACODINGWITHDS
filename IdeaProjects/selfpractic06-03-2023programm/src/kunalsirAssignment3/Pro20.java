package kunalsirAssignment3;
import java.util.Scanner;
public class Pro20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number");
        int n1 = sc.nextInt();
        System.out.println("Enter second Number");
        int n2 = sc.nextInt();
        int max = (n1 > n2) ? n1 : n2;
        while (true)
        {
            if ((max % n1 == 0) && (max % n2 == 0)) {
                System.out.println("The LCM of "+n1+ " or "+n2+" is-> "+" "+ max);
                break;
            }
            ++max;

        }
    }
}
