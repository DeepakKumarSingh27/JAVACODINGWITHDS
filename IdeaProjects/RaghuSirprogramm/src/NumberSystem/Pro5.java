package NumberSystem;
import java.util.Scanner;
public class Pro5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Temp in form of calcious:");
        int cal=sc.nextInt();
        int fra=(cal*9)/5+32;
        System.out.println("Temp in the form of fra is "+fra);
    }
}
