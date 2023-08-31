package NumberSystem;

import java.util.Scanner;

public class Pro23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the month number:");
        int m=sc.nextInt();
        switch (m)
        {
            case 1:
                System.out.println("31 Days Jan");
                break;
            case 2:
                System.out.println("28 or 29 Days feb");
                break;
                case 3:
            System.out.println("31 Days mar");
            break;
            case 4:
            System.out.println("30 Days april");
            break;
            case 5:
            System.out.println("31 Days may");
            break;
            case 6:
            System.out.println("30 Days Jun");
            break;
            case 7:
            System.out.println("31 Days July");
            break;
            case 8:
            System.out.println("31 Days Aug");
            break;
            case 9:
            System.out.println("30 Days sep");
            break;
            case 10:
            System.out.println("30 Days oct");
            break;
            case 11:
                System.out.println("30 Days Nov");
                break;
            case 12:
                System.out.println("31 Days Dec");
                break;
            default:
                System.out.println("month don't match");
        }
    }
}
