package kunalSirAssignment4;
import java.util.Scanner;
public class pro8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Subject");
        int count = sc.nextInt();
        System.out.println("Enter marks of " + count + " subject");
        float totalMarks = 0;
        for (int i = 0; i < count; i++) {
            totalMarks += sc.nextFloat();
        }
        System.out.println("totalMarks: " + totalMarks);
        float percentage=((totalMarks)/(count*100)) *100;
        switch ((int) percentage / 10) {
            case 9:
                System.out.println("Grade : A+");
                break;
            case 8:
            case 7:
                System.out.println("Grade : A");
                break;
            case 6:
                System.out.println("Grade : B");
                break;
            case 5:
                System.out.println("Grade : C");
                break;
            default:
                System.out.println("Grade : D");
                break;
        }

    }
}
