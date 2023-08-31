package Raghusirclasswork.groomingsessionQuestions;
import java.util.Scanner;
public class FindDesiredSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the row");
        int m= sc.nextInt();
        System.out.println("Enter the col");
        int n = sc.nextInt();
        int[][] arr= new int[m][n];
        System.out.println("Enter "+m*n+" values");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("user entered array element are ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter the row");
        int r= sc.nextInt();
        System.out.println("Enter the col");
        int c= sc.nextInt();
        int rsum=0,csum=0;
        for (int i = 0; i <arr[0].length ; i++) {
            rsum=rsum+arr[r-1][i];
        }
        for (int i = 0; i <arr.length ; i++) {
            csum=csum+arr[i][c-1];
        }
        System.out.println(rsum+"   "+csum);
    }
}
