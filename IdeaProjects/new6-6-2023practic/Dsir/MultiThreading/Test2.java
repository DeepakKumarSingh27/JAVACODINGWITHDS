package Dsir.MultiThreading;
class myThread2 extends Thread {
    public void run() {
        for (int i = 0; i <=10; i++) {
            System.out.println("child Thread");
            // Thread.yield();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Test2 {
    public static void main(String[] args) throws Exception{
        myThread2 t = new myThread2();
        t.start();
        //t.join();
        for (int i = 0; i <= 10; i++) {
            System.out.println("main Thread");
        }
    }
}
/*
 // System.out.println(Thread.currentThread().getName());
        //System.out.println(t.getName());
//        Thread.currentThread().setName("Deepak");
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getPriority());
        //  Thread.currentThread().setPriority(8);
//        myThread2 t = new myThread2();
//        System.out.println(t.getPriority());
//        System.out.println(Thread.currentThread().getName());
 */