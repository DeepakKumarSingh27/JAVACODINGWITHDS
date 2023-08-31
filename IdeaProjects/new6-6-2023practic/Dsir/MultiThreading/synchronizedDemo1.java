package Dsir.MultiThreading;
class Display {
    public synchronized void displayn() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i+" ");
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public synchronized void displayc() {
        for (int i = 65; i <= 75; i++) {
            System.out.print((char) i+" ");
        }
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){

        }
    }
}
class myThread4 extends Thread {
    Display d;
    myThread4(Display d) {
        this.d=d;
    }
    public void run() {
        d.displayn();
    }
}
class myThread5 extends Thread {
    Display d;
    myThread5(Display d) {
        this.d=d;
    }
    public void run() {
        d.displayc();
    }
}
public class synchronizedDemo1 {
    public static void main(String[] args) {
        Display d = new Display();
        myThread4 t1 = new myThread4(d);
        myThread5 t2 = new myThread5(d);
        t1.start();
        t2.start();
    }
}
