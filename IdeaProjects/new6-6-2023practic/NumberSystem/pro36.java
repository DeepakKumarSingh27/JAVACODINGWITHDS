package NumberSystem;
import java.util.Scanner;
public class pro36 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;
        do {
            int d = n %10;
            if(d==2|| d== 3|| d==5|| d==7)
            sum +=d;
            n /= 10;
        } while (n !=0);
        System.out.println(sum);
    }
}
