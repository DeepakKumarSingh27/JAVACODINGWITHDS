package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Arr12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first size of Array");
        int n= sc.nextInt();
        int[] ar=new int[n];
        System.out.println("Enter size of second Array");
        int m =sc.nextInt();
        int[] br=new int[m];
        System.out.println("Enter first Array  "+n+" values");
        for (int i = 0; i < ar.length; i++) {
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter second Array  "+m+" values");
        for (int i = 0; i < br.length; i++) {
            br[i]=sc.nextInt();
        }
        int[] z=MargedZigZagArray(ar,br);
        System.out.println(Arrays.toString(z));
    }
    static int[] MargedZigZagArray(int[] ar, int[] br) {
        int[] z = new int[ar.length+br.length];
      int i = 0, j = 0;
      while (i < ar.length && i < br.length){
        z[j] = ar[i];
        j++;
        z[j] = br[i];
        i++;
        j++;
      }
      while (i < ar.length){
          z[j] = ar[i];
          j++;
          i++;
      }
      while (i < br.length){
          z[j] = br[i];
          j++;
          i++;
      }
      return z;
    }
}
