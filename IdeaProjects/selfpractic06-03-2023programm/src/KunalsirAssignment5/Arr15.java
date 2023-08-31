package KunalsirAssignment5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Arr15 {
    public static void main(String[] args) {
      int[]  num = {1,2,0,0};
          int k = 34;
        //System.out.println(Arrays.toString(addToArrayForm(num,k)));
        List<Integer> al=new ArrayList<>(addToArrayForm(num,k));
        for (Integer i:al){
            System.out.println(i);
        }
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
      int n = num.length;
      int i = n - 1;
      List <Integer> sol = new ArrayList<>();
      while ( i -- >= 0 || k > 0){
          if(i >= 0){
              sol.add((num[i] + k) % 10);
              k =(num[i] + k) /10;
          }else {
              sol.add(k % 10);
              k /= 10;
          }
          i--;
      }
        Collections.reverse(sol);
      return sol;
    }
}
