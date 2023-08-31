package Dsir.MultiThreading;
class myThread3 extends Thread {
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("I am lazy Thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("I got Interrupted");
            }
        }
    }
    }
    public class ThreadSleepDemo {
        public static void main(String[] args) {
            myThread3 t = new myThread3();
            t.start();
            t.interrupt();
            System.out.println("End of main Thread");
        }
    }
