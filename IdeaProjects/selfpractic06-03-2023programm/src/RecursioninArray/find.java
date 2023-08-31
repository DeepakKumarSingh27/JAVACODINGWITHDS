package RecursioninArray;
import java.util.ArrayList;
public class find {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 4, 5};
//        System.out.println(find(arr, 4, 0));
//        System.out.println(findIndex(arr, 4, 0));
//        System.out.println(findIndexLast(arr, 4, arr.length - 1));
//        findIndexAll(arr, 4, 0);
//        ArrayList<Integer> ans = findAllIndex2(arr, 4, 0);
//        System.out.println(ans);
        System.out.println(findAllIndex2(arr,4,0));
    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }

    static int findIndexLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndexLast(arr, target, index - 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void findIndexAll(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            find.list.add(index);
        }
        findIndexAll(arr, target, index + 1, list);
    }

    static ArrayList<Integer> findAllIndex1(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex1(arr, target, index + 1, list);
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {
        ArrayList<Integer> list =new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ans = findAllIndex2(arr, target, index + 1);
        list.addAll(ans);
        return list;
    }
}

