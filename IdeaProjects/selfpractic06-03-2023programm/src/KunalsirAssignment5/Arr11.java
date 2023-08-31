package KunalsirAssignment5;
import java.util.Arrays;
public class Arr11 {
    public static void main(String[] args) {
        int[][] image = {{1,1,0,0}, {1,0,0,1}, {0,1,1,1},{1,0,1,0}};
        int[][] ans = flipAndInvertImage(image);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
        //System.out.println(Arrays.toString(flipAndInvertImage(image)));
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int f = 0, l = image[i].length - 1;
            while (f < l) {
                int temp = image[i][f];
                image[i][f] = image[i][l];
                image[i][l] = temp;
                f++;
                l--;
            }
        }
        int[][] ans = invertImage(image);
        return ans;
    }

    static int[][] invertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j]==0)
                {
                 image[i][j]=1;
                }
                else if (image[i][j]==1)
                {
                    image[i][j]=0;
                }
            }
        }
        return image;
    }
}