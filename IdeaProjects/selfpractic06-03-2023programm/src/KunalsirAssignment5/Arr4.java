package KunalsirAssignment5;
import java.util.Arrays;
import java.util.Scanner;

public class Arr4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int[]  nums = {1,1,2,2};
        System.out.println("Enter the value of N");
      int n=sc.nextInt();
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }
    public static int[] shuffle(int[] nums, int n) {
       int[] ar=new int[nums.length/2];
       int[] br=new int[nums.length/2];
       for (int i=0;i<nums.length/2;i++)
       {
           ar[i]=nums[i];
           br[i]=nums[i+n];
       }
       int[] z=new int[br.length+ar.length];
       int k=0,j=0,i=0;
       while (k<ar.length && k<br.length){
           z[j]=ar[i];
           j++;
           z[j]=br[i];
           i++;
           j++;
           k++;
       }
       return z;
    }
}
