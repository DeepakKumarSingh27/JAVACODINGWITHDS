package Dsir.MultiThreading;

public class Test3 {
    public static void main(String[] args) throws Exception {
//        System.out.println("Main Start");
//      Thread.currentThread().join();
//        System.out.println("Main End");
        for (int i = 1; ;) {
            System.out.println("Slid "+i);
            Thread.sleep(1000);
            i++;
        }

    }
}
