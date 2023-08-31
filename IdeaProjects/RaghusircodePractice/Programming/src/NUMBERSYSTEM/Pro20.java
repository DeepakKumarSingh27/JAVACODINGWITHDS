package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Three Number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        //int small = (a<b && a< c)?a:b<c?b:c;
        int small = a;
        if (b<small)
            small=b;
        else if (c<small)
            small=c;
        System.out.println(small);
    }
}
