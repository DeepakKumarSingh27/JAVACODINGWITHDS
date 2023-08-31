package NumberSystem1;
import java.util.Scanner;
public class Pro5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Fahrenheit (°F)");
        int cal = sc.nextInt();
        int fran = (cal)*9/5+32;
        System.out.println("Temperature in Celsius (°C) "+fran);
    }
}
