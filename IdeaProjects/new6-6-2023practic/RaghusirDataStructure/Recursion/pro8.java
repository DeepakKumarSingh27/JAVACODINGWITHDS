package RaghusirDataStructure.Recursion;

public class pro8 {
    public static void main(String[] args) {
        int[] arr = {25,28,38,18,15,24};
        int in = search(arr,38);
        if (in == -1) {
            System.out.println("Not present");
        } else {
            System.out.println("present");
        }
    }

    public static int search(int[] arr, int ele) {
        return search(arr,ele,arr.length-1);
    }

    public static int search(int[] arr, int ele, int index) {
        if (index < 0) {
            return -1;
        }
        if (arr[index] == ele) {
            return index;
        }
        return search(arr,ele,index-1);
    }
}
