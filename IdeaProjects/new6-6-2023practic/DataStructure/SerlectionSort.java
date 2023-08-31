package DataStructure;

import java.util.Arrays;

public class SerlectionSort {
    public static void main(String[] args) {
        int[] arr={2,55,66,11,8,4};
        for (int i = 0; i < arr.length-1; i++) {
            int small=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[small]>arr[j])
                {
                    small=j;
                }
                int temp=arr[small];
                arr[small]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
