package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temp");
        int temp=sc.nextInt();
        int fran = (temp*9)/5+32;
        System.out.println(fran);
    }
}
