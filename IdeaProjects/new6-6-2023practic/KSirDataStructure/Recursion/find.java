package KSirDataStructure.Recursion;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;

public class find {
    public static void main(String[] args) {
        int[] arr={2,3,1,4,4,5};
        int target = 7;
//        System.out.println(findLast(arr,target,arr.length-1));
//        findAllIndex(arr,target,0);
//        System.out.println(list);
        System.out.println(findAllINdex2(arr,4,0));
    }
    public static boolean find(int[] arr, int target,int index){
        if (index == arr.length){
            return false;
        }
        return arr[index]==target || find(arr,target,index+1);
    }
    public static int findIndex(int[] arr, int target,int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return  findIndex(arr, target, index + 1);
        }
    }

    public static int findLast(int[] arr, int target,int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return  findLast(arr, target, index - 1);
        }
    }
    static ArrayList<Integer> list = new ArrayList<>();
    public static void findAllIndex(int[] arr, int target,int index) {
        if (index == arr.length) {
            return ;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr,target,index+1);
    }
    public static ArrayList<Integer> findAllIndexlast(int[] arr, int target,int index,ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return   findAllIndexlast(arr,target,index+1,list);
    }

    public static ArrayList<Integer> findAllINdex2(int[] arr,int target,int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ans  = findAllINdex2(arr,target,index+1);
        list.addAll(ans);
        return list;
    }

}
