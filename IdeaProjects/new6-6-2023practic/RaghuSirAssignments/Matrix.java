package RaghuSirAssignments;
import java.util.Scanner;
public class Matrix {
    int[][] readArray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order of Matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        System.out.println("Enter "+r*c+" values");
        for (int i = 0; i <mat.length ; i++) {
            for (int j = 0; j <mat[i].length ; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        return mat;
    }
    public void disp(int[][] mat)
    {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j <mat[i].length ; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public int getBiggest(int[][] mat) {
        int big = mat[0][0];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j <mat[i].length ; j++) {
                if (mat[i][j] > big)
                    big = mat[i][j];
            }
        }
        return big;
    }
    public int getSmallest(int[][] mat) {
        int small = mat[0][0];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j <mat[i].length ; j++) {
                if (mat[i][j] < small)
                    small = mat[i][j];
            }
        }
        return small;
    }
    public int[][] transpose(int[][] mat) {
        int[][] tr = new int[mat.length][mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                tr[j][i] = mat[i][j];
            }
        }
        return tr;
    }
    public int[][] addMatrix(int[][] a,int[][]b) {
        int[][] add = new int[a.length][b.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                add[i][j] = a[i][j] + b[i][j];
            }
        }
        return add;
    }
    public int[] checkevenodd(int[][] mat) {
        int ec=0,oc=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] % 2 == 0)
                {
                    ec++;
                } else {
                    oc++;
                }
            }
        }
        int[] x = {ec,oc};
        return x;
    }
    public int checkprime(int[][] mat) {
        int count =0;
        for (int i = 0; i <mat.length ; i++) {
            for (int j = 0; j <mat[i].length ; j++) {
                boolean rs = isprime(mat[i][j]);
                if (rs){
                    count++;
                }
            }
        }
        return count;
    }

    public boolean isprime(int x) {
        for (int i = 2; i <= x/2; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
