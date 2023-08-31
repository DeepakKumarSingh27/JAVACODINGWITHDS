package Raghusirclasswork.OneDArray;

public class arr18 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[] x = ao.readArray();
        System.out.println("user entered element is ");
        ao.show(x);
        printfreq(x);
    }

    public static void printfreq(int[] x) {
        int big=x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i]>big){
                big=x[i];
            }
        }
        int[] count= new int[big+1];
        for (int i = 0; i <x.length ; i++) {
            count[x[i]]++;
        }
        for (int i = 0; i <count.length ; i++) {
            if (count[i]!=0){
                System.out.println(i+" ----> "+count[i]);
            }
        }
    }
}
