package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Month Number");
        int m=sc.nextInt();
        switch (m){
            case 1-> System.out.println("jan");
            case 2-> System.out.println("feb");
            case 3-> System.out.println("march");
            case 4-> System.out.println("Apri");
            case 5-> System.out.println("may");
            case 6-> System.out.println("june");
            case 7-> System.out.println("july");
            case 8-> System.out.println("Aug");
            case 9-> System.out.println("sep");
            case 10-> System.out.println("oct");
            case 11-> System.out.println("Nov");
            case 12-> System.out.println("Dec");

            default -> System.out.println("month don't matched");
        }
    }
}
