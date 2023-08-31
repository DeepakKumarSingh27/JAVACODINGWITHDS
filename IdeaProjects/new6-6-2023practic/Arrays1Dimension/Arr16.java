package Arrays1Dimension;
import java.util.Scanner;
public class Arr16 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        Scanner sc= new Scanner(System.in);
        int[] x= ao.ReadArray();
        System.out.println("user entered element is");
        ao.DisplayArray(x);
        System.out.println("Enter the index you want to delete ");
        int in = sc.nextInt();
        int[] z = DeleteElement(x,in);
        System.out.println("After deleting Array is ");
        ao.DisplayArray(z);
    }

    public static int[] DeleteElement(int[] x, int in) {
        int[] z = new int[x.length-1];
        for (int i = 0; i < x.length-1; i++) {
            if (i < in)
                z[i] = x[i];
            else
                z[i] = x[i+1];
        }
        return z;
    }
}
