package NumberSystem;
import java.util.Scanner;
public class Pro5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the tempin cal");
        int cal=sc.nextInt();
        int farn=(cal*9)/5+32;
        System.out.println("faranhite is "+farn);
    }
}
