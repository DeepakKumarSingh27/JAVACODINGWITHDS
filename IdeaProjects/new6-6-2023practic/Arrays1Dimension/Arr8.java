package Arrays1Dimension;
public class Arr8 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[] x = ao.ReadArray();
        System.out.println("user entered element is");
        ao.DisplayArray(x);
       int[] ct = EvenOddCount(x);
        System.out.println("Even "+ct[0]);
        System.out.println("Odd "+ct[1]);
    }

    public static int[] EvenOddCount(int[] x) {
        int even=0,odd=0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0) even++;
            else odd++;
        }
        int[] ct ={even,odd};
        return ct;
    }
}
