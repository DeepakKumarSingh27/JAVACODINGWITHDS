package KunalsirAssignment5;
public class Arr10 {
    public static void main(String[] args) {
        int[]  gain = {-5,1,5,0,-7};
        int ans=largestAltitude(gain);
        System.out.println(ans);
    }
    public  static int largestAltitude(int[] gain) {
        int max=0;
        int current=0;
        for (int i=0;i<gain.length;i++)
        {
            current+=gain[i];
            max=Math.max(current,max);
        }
        return max;
    }
}
