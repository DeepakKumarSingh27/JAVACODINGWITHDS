package Raghusirclasswork.OneDArray;
import java.util.Arrays;
import java.util.Scanner;
public class arr14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayOperation ao = new ArrayOperation();
        int[] x= ao.readArray();
        System.out.println("user entered  array element is ");
        ao.show(x);
        System.out.println("Enter the index");
        int in = sc.nextInt();
        System.out.println("Enter the ele");
        int ele= sc.nextInt();
        int[] z= margedArray(x,ele,in);
        System.out.println(Arrays.toString(z));
    }

    public static int[] margedArray(int[] x, int ele, int in) {
        if (in <0&&in>x.length){
            System.out.println("index out of range");
            return x;
        }
        int[] z= new int[x.length+1];
        z[in]=ele;
        for (int i = 0; i < x.length; i++) {
            if (i<in){
                z[i]=x[i];
            }else {
                z[i+1]=x[i];
            }
        }
        return z;

    }
}
