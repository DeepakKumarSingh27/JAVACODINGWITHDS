package Raghusirclasswork.OneDArray;
import java.util.Arrays;
import java.util.Scanner;
public class arr15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayOperation ao = new ArrayOperation();
        int[] x= ao.readArray();
        System.out.println("user entered  array element is ");
        ao.show(x);
        System.out.println("Enter the index");
        int in = sc.nextInt();
        int[] z=deleteele(x,in);
        System.out.println(Arrays.toString(z));
    }

    public static int[] deleteele(int[] x, int in) {
        if (in<0&&in>x.length){
            System.out.println("index not in arange");
            return x;
        }
        int[] z = new int[x.length-1];
        for (int i = 0; i < x.length-1; i++) {
            if (i<in)
                z[i]=x[i];
            else
                z[i]=x[i+1];
        }
        return z;
    }
}
