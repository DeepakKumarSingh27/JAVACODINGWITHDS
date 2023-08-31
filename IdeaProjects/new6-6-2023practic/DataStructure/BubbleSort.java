package DataStructure;
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] ={2,5,4,7,1};
        /*
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }

         */

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1])
                {
                    arr[i] ^= arr[j];
                    arr[j] ^= arr[i];
                    arr[i] ^= arr[j];
                }
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
