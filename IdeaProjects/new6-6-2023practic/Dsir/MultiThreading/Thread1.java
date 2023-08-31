package Dsir.MultiThreading;

public class Thread1 {
    public static void main(String[] args) throws InterruptedException {
        Thread2 b = new Thread2();
        b.start();
        synchronized (b){
            System.out.println("main thread calling wait method");
            b.wait();
            System.out.println("main thread got notification");
            System.out.println(b.total);
        }
    }
}
class Thread2 extends Thread {
    int total = 0;
    public void run(){
       synchronized (this) {
           System.out.println("child thread start calculation");
           for (int i = 1; i <=100 ; i++) {
               total = total+i;
           }
           System.out.println("child thread given notification");
           this.notify();
       }
    }
}