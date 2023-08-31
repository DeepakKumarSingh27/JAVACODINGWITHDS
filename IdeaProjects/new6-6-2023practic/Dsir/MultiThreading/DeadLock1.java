package Dsir.MultiThreading;

class A1 {
    public synchronized void d1(B1 b) {

        System.out.println("Thread1 start execution of d1() method.. ");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
        }
            System.out.println("Thread1 try to call B's last() method");
            b.last();

    }

    public synchronized void last() {
        System.out.println("inside A's this is  last() method..");
    }
}

class B1 {
    public synchronized void d2(A1 a) {
        System.out.println("Thread2 start execution of d2() method.. ");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {}
            System.out.println("Thread2 try to call A's last() method..");
            a.last();
    }

    public synchronized void last() {
        System.out.println("inside B's last() method..");
    }
}

public class DeadLock1 extends Thread {
    A1 a = new A1();
    B1 b = new B1();

    public void m1() {
        this.start();
        a.d1(b);
    }

    public void run() {

        b.d2(a);
    }

    public static void main(String[] args) {
        DeadLock1 d = new DeadLock1();
        d.m1();
    }
}

