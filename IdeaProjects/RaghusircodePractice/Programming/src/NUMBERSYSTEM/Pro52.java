package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro52 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Enter the Base");
        int p=sc.nextInt();
        int z=isPower(n,p);
        System.out.println(z);
    }
    static int isPower(int n, int p) {
        int pro=1;
        while (p>0){
            pro=pro*n;
            p--;
        }
        return pro;
    }
}
