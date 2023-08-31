package NumberSystem;
import java.util.Scanner;
public class Pro56 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        String st=xylomPholem(n);
        System.out.println(n+" is "+st);

    }
    static String xylomPholem(int n)
    {
        int os=0,ms=0,temp=n;
        do {
            int d=n%10;
            if (temp==n||n<10)
                os=os+d;
            else
                ms=ms+d;
            n=n/10;
        }while (n!=0);
        if (ms==os)
            return "xylem";
        else
            return "phloem";
    }
}
