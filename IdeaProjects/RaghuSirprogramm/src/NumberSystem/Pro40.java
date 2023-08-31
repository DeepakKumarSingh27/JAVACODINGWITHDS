package NumberSystem;
import java.util.Scanner;
public class Pro40 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();//123456
        int count1=0;
        do {
         int d=n%10;
         if (d==1||d==2||d==3||d==5||d==7)
             count1++;
         n/=10;
        }while (n!=0);
        System.out.println(count1+" ");
    }
}
