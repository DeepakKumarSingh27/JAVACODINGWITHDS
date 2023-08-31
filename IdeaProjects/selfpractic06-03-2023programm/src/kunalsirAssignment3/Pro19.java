package kunalsirAssignment3;
import java.util.Scanner;
public class Pro19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Number");
        int n1=sc.nextInt();
        System.out.println("Enter the second Number");
        int n2=sc.nextInt();
        int hcf=1;
        for(int i = 1; i <= n1 || i <= n2; i++) {
            if(n1 % i == 0 && n2 % i == 0)
                hcf = i;
        }
        System.out.println("The HCF "+hcf);
    }
}
