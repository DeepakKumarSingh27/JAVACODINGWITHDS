package kunalsirAssignment3;
import java.util.Scanner;
public class Pro18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Investment amount ");
        int I=sc.nextInt();
        System.out.println("Enter Interest rate");
        int R=sc.nextInt();
        System.out.println("Enter Number of Year");
        int T=sc.nextInt();
        int fv=I*(int) Math.pow(1+R,T);
        System.out.println(fv);
    }
}
