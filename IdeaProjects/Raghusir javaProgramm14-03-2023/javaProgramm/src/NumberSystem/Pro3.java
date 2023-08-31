package NumberSystem;
import java.util.Scanner;
public class Pro3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the NUmber");
        int n=sc.nextInt();
        if (n<9)
        {
            n*=-1;
        }
        System.out.println("positive format is "+n);
    }
}
