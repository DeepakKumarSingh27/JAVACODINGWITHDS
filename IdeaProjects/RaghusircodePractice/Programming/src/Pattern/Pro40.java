package Pattern;
import java.util.Scanner;
public class Pro40 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int sp=0,st=n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp-1; j++) {
                System.out.print(" ");
            }
            int k =1;
            for (int j = 1; j <=st ; j++) {
                System.out.print(k+" ");
                if (j<=st/2){
                    k++;
                }else {
                    k--;
                }
            }
            if (i<=n/2){
                sp++;
                st=st-2;
            }
            else {
                sp--;
                st=st+2;
            }
            System.out.println();
        }
    }
}
