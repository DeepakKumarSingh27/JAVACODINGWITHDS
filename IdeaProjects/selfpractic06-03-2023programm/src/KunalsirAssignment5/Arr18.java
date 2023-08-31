package KunalsirAssignment5;
public class Arr18 {
    public static void main(String[] args) {
        int[][] logs = {{1993,1999},{2000,2010}};
      int x = maximumPopulation(logs);
        System.out.println(x);
    }
    public static int maximumPopulation(int[][] logs) {
     int[] arr = new int[101];
        for (int i = 0; i < logs.length; i++) {
            for (int j = logs[i][0]; j < logs[i][1]; j++) {
                arr[j - 1950]++;
            }
        }
        int maxval = 0;
        int maxYear = 1950;
        for (int i = 0; i < 101; i++) {
            if (maxval < arr[i]){
                maxval = arr[i];
                maxYear = i + 1950;
            }
        }
        return maxYear;
    }
}
