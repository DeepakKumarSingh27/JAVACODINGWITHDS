package Arrays1Dimension;
public class Arr17 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[] x= ao.ReadArray();
        findFreq(x);
    }

    public static void findFreq(int[] x) {
     boolean[] rs = new boolean[x.length];
        for (int i = 0; i < x.length; i++) {
            if (rs[i] == false) {
                int count =1;
                for (int j = i+1; j < x.length; j++) {
                    if (x[i] == x[j]) {
                        count++;
                        rs[j] = true;
                    }
                }
                System.out.println(x[i]+" -> "+count);
            }
        }
    }
}
