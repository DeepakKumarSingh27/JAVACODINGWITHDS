package Raghusirclasswork.NumberSystem;
import java.util.Scanner;
public class pro15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter four subject marks");
        int ph = sc.nextInt();
        int ch = sc.nextInt();
        int m= sc.nextInt();
        int b= sc.nextInt();
        if (ph> 35||ch>35||m>35||b>35)
            System.out.println("pass");
        else System.out.println("fail");

    }
}
