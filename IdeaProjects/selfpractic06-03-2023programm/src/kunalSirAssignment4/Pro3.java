package kunalSirAssignment4;
import java.util.Scanner;
public class Pro3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Age");
        int age=sc.nextInt();
        EligibleForVote(age);
    }
    static void EligibleForVote(int age) {
        if (age > 18){
            System.out.println("you are eligible for vote");
        }else {
            System.out.println("you are not eligible for vote");
        }
    }
}
