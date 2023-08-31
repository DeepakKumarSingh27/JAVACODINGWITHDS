package kunalsirAssignment3;

import java.util.Scanner;

public class Pro12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter five subject marks");
        double phy=sc.nextDouble();
        double chem=sc.nextDouble();
        double math=sc.nextDouble();
        double bio=sc.nextDouble();
        double eng=sc.nextDouble();
        double total=phy+chem+math+bio+eng;
        double avg=total/5;
        double perc=(avg/500)*100;
        System.out.println(perc);

    }
}
