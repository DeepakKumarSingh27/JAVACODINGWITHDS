package NumberSystem;
import java.util.Scanner;
public class Pro16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the mont Number");
        int m=sc.nextInt();
        if (1>=1||m<=12)
        {
            System.out.println(m+" month is valid");
        }
        else
        {
            System.out.println(m+" is invalid");
        }
    }
}
