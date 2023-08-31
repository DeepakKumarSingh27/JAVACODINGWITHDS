package String;
import java.util.Scanner;
public class Str19 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Amount");
        int amt=sc.nextInt();
        nw(amt/10000000,"crore");
        nw(amt/1000000%100,"lakh");
        nw(amt/1000%100,"thousand");
        nw(amt/100%10,"hundred");
        nw(amt%100,"");
    }

    public static void nw(int n, String st) {
        String[] fw={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fifteen","sixteen","eighteen","nineteen","twenty"};
        String[] tw={"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
        if (n<20)
            System.out.println(fw[n]);
        else
            System.out.println(tw[n/10]+fw[n%10]);
        if (n!=0)
            System.out.println(st+" ");
    }
}
