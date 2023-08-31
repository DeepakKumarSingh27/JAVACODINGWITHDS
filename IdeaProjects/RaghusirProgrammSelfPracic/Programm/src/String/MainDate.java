package String;
import java.util.Scanner;
public class MainDate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first date(dd mm yy)");
        int d1=sc.nextInt();
        int m1=sc.nextInt();
        int y1=sc.nextInt();

        Date dt1=new Date(d1,m1,y1);
        System.out.println("Enter second date(dd mm yy)");
        int d2=sc.nextInt();
        int m2=sc.nextInt();
        int y2=sc.nextInt();
        Date dt2=new Date(d2,m2,y2);
        System.out.println(dt2.noofDays()-dt2.noofDays());
        System.out.println("first date day name is "+dt1.getDayName());
        System.out.println("second date days number "+dt2.getDayName());
    }

}
