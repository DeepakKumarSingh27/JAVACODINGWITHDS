package OneDArray;
import java.util.Scanner;
public class Arr22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayOperation ao=new ArrayOperation();
        System.out.println("Enter first Array");
        int[] a=ao.readArray();
        System.out.println("Enter second Array");
        int[] b=ao.readArray();
        System.out.println("user entered element is");
        ao.dispArray(a);
        ao.dispArray(b);
        System.out.println("Enter the index");
        int in=sc.nextInt();
        int[] z=margeArray(a,b,in);
        ao.dispArray(z);
    }
    static int[] margeArray(int[] a, int[] b, int in)
    {
      int[] x=new int[a.length+b.length];
      for (int i=0;i<a.length;i++)
      {
          x[i+in]=a[i];
      }
      for (int i=0;i<b.length;i++)
      {
          if (i<in)
          x[i]=b[i];
          else
              x[i+a.length]=b[i];
      }
      return x;
    }
}
