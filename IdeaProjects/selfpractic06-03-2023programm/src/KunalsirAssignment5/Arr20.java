package KunalsirAssignment5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Arr20{
    public static void main(String[] args) {
        //int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> ans =spiralOrder(matrix);
        for (int x: ans){
            System.out.println(x);
        }
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = n - 1;
        int top = 0 ;
        int button = m - 1;
        while (m * n > ans.size()){
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            for (int i = top + 1; i <= button; i++) {
                ans.add(matrix[i][right]);
            }
            if (top != button) {
                for (int i = right - 1; i >= left; i--) {
                    ans.add(matrix[button][i]);
                }
            }
            if (left != right)
            {
                for (int i = button - 1; i > top ; i--) {
                    ans.add(matrix[i][left]);
                }
            }
            top++;
            button-- ;
            left++;
            right--;
        }
        return ans;
    }
}
