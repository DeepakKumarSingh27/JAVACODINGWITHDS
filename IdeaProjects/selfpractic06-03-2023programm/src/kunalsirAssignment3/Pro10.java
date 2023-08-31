package kunalsirAssignment3;
import java.util.Scanner;
public class Pro10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter subject points you want to");
        int n=sc.nextInt();
//        double sub1=sc.nextDouble();
//        double sub2=sc.nextDouble();
//        double sub3=sc.nextDouble();
//        double sub4=sc.nextDouble();
//        double sub5=sc.nextDouble();
//      double totalNumber=sub1+sub2+sub3+sub4+sub5;
//      double cgpa=totalNumber/5;
//        System.out.println(cgpa);
        double[] ar=new double[n];
        double sum=0;
        System.out.println("Enter "+n+" Grade points");
        for (int i=0;i<ar.length;i++)
        {
            ar[i]=sc.nextDouble();
        }
        for (int i=0;i<ar.length;i++)
        {
            sum=sum+ar[i];
        }
        System.out.println("cgpa is "+sum/ar.length);
    }
}
