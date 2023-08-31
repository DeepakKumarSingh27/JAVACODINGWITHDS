package Raghusirclasswork.TwoDArray;
import java.util.Scanner;
public class ArrayOperation {
    int[][] readArray() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the row ");
        int row = sc.nextInt();
        System.out.println("Enter the column");
        int col= sc.nextInt();
        int[][] mat= new int[row][col];
        System.out.println("Enter "+row*col+" values");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j <mat[i].length ; j++) {
                mat[i][j]= sc.nextInt();
            }
        }
        return mat;
    }
    public void disp(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] x= ao.readArray();
        ao.disp(x);
    }
}
