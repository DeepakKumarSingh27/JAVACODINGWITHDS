package NumberSystem;
import java.util.Scanner;
public class Pro41 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();//153,371->1+343+27=>
        int arm=0,temp=n;
        do {
            int d=n%10;
            arm+=d*d*d;
            n/=10;
        }while (n!=0);
        if (arm==temp)
            System.out.println(temp+" is armstrong number:");
        else
            System.out.println(temp+" is not a armstrong number:");
    }
}
