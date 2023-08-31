package KSirDataStructure;

public class LinearSort {
    public static void main(String[] args) {
        int[] numes = {23,45,1,2,8,19,-3,16,-11,28};
        int target = 19;
        boolean ans = linearSearch3(numes,target);
        System.out.println(ans);
    }

    static boolean linearSearch3(int[] arr,int target){
        if (arr.length == 0) {
            return false;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return true;
            }
        }
        return false;
    }
//    static int linearSearch2(int[] arr,int target){
//        if (arr.length == 0) {
//            return -1;
//        }
//        for (int index = 0; index < arr.length; index++) {
//            int element = arr[index];
//            if (element == target) {
//                return element;
//            }
//        }
//        return -1;
//    }


//    static int linearSearch(int[] arr,int target){
//        if (arr.length == 0) {
//            return -1;
//        }
//        for (int index = 0; index < arr.length; index++) {
//            int element = arr[index];
//            if (element == target) {
//                return index;
//            }
//        }
//        return -1;
//    }
}
