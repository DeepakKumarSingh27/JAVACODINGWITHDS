package KSirDataStructure.LargeNumbers;

public class MainRunner {
    public static void main(String[] args) {
        Runnable ar = new AppleRunnable();
        Thread t1 = new Thread(ar);
        t1.start();
        Runnable or = new OrangeRunnable();
        Thread t2 = new Thread(or);
        t2.start();
    }
}
