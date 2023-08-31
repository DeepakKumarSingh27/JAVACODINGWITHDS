package NumberSystem1;


import java.util.Scanner;

public class pro16forst {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        if (n<=12) System.out.println("valid");
        else System.out.println("invalid");
    }
}
