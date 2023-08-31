package kunalsirAssignment3;
import java.util.Scanner;
public class Pro9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Input Runs");
        int input_runs=sc.nextInt();
        System.out.println("Enter matches ");
        int matches=sc.nextInt();
        System.out.println("Enter not out");
        int ont_out=sc.nextInt();
        int notbsm=matches-ont_out;
        int BattingAvg=input_runs/notbsm;
        System.out.println(BattingAvg);
        if (BattingAvg==-1)
        {
            System.out.println("NA");
        }
        else
        {
            System.out.println(BattingAvg);
        }
    }
}
