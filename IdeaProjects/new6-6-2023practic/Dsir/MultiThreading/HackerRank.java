package Dsir.MultiThreading;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class HackerRank {
    public static void main(String[] args) {
        int[] arr ={1,3,5,7,9};
        List<Integer> al = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            int m = arr[i];
            al.add(m);
        }
        miniMaxSum(al);
    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long secondmax=0;
        long max=0;
        Collections.sort(arr);
        for(int i=1;i<arr.size();i++){
            max=max+arr.get(i);
        }
        for(int i=0;i<arr.size()-1;i++){
            secondmax=secondmax+arr.get(i);
        }
        System.out.print(secondmax +" "+ max);
    }
}
/*al.add(1);
        al.add(3);
        al.add(5);
        al.add(7);
        al.add(9);*/