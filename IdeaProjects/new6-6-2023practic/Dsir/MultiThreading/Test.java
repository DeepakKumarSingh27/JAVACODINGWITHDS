package Dsir.MultiThreading;
class mythread1 extends Thread {
    public void start()
    {
        super.start();
        System.out.println("Start method");
    }
    public void run()
    {
        System.out.println("Run method");
    }
}
public class Test {
    public static void main(String[] args) {
        mythread1 t = new mythread1();
        t.start();
        System.out.println("main method");
    }
}
