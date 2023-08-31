package Dsir.MultiThreading;
class myThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10 ; i++) {
            System.out.println("Child class");
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        myThread t = new myThread();
        t.start();
        for (int i = 0; i <= 10; i++) {
            System.out.println("main Thread");
        }
    }
}
