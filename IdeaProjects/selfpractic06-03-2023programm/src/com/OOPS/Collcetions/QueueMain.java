package com.OOPS.Collcetions;
public class QueueMain {
    public static void main(String[] args) throws Exception {
       // CustomQueue queue = new CustomQueue(5);
        CircularQueue queue = new CircularQueue(5);
        queue.inset(3);
        queue.inset(6);
        queue.inset(5);
        queue.inset(19);
        queue.inset(1);
         queue.display();
        System.out.println(queue.remove());
        queue.inset(133);
        queue.display();

    }
}
