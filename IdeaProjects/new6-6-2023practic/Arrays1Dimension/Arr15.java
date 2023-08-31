package Arrays1Dimension;
import java.util.Scanner;
public class Arr15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    ArrayOperation ao = new ArrayOperation();
    int[] x = ao.ReadArray();
        System.out.println("user entered element is");
        ao.DisplayArray(x);
        System.out.println("Enter the index");
        int in = sc.nextInt();
        System.out.println("Enter the element");
        int ele = sc.nextInt();
        int[] z = insertEle(x,in,ele);
        System.out.println("new Array is ");
        ao.DisplayArray(z);
    }

    public static int[] insertEle(int[] x, int in,int ele) {
        int[] z= new int[x.length+1];
        z[in] = ele;
        for (int i = 0; i < x.length; i++) {
            if (i < in)
                z[i] =x[i];
            else
                z[1+i] = x[i];
        }
        return z;
    }
}
