package OneDArray;
import java.util.Scanner;
public class Arr19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        printFreqDigits(n);
    }
    static void printFreqDigits(int n)
    {
        int[] count=new int[10];
        do {
            int r=n%10;
            count[r]++;
            n=n/10;
        }while (n!=0);
        for (int i=0;i<count.length;i++)
        {
            if (count[i]!=0)
                System.out.println(i+" -----> "+count[i]);
        }
    }
}
