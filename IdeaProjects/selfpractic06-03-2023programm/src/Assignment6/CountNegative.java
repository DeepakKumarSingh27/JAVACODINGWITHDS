package Assignment6;
public class CountNegative {
    public static void main(String[] args) {
        //int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int[][] grid = {{3,2},{1,0}};
        int count = countNegatives(grid);
        System.out.println(count);
    }
    public static int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j]< 0)
                    count++;
            }
        }
        return count;
    }
}
