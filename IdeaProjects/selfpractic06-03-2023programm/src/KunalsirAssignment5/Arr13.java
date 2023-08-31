package KunalsirAssignment5;
public class Arr13 {
    public static void main(String[] args) {
//       int[][] mat = {{1,2,3},
//                       {4,5,6},
//                       {7,8,9}
//       };
//        int[][] mat= {{1,1,1,1},
//                {1,1,1,1},
//                {1,1,1,1},
//                {1,1,1,1}};
        int[][] mat= {{5}};

        int ans=diagonalSum(mat);
        System.out.println(ans);
    }
    public static int diagonalSum(int[][] mat) {
        int sum=0;
        for (int i = 0; i < mat.length ; i++) {
            sum = sum + mat[i][i] + mat[i][mat.length - i - 1];
        }
        if (mat.length % 2==0){
            return sum;
        }else {
            return sum - mat[mat.length/2][mat.length/2];
        }
    }
}
