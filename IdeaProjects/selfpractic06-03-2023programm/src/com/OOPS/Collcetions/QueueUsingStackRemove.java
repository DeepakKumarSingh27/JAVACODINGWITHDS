package com.OOPS.Collcetions;
import java.util.Stack;
public class QueueUsingStackRemove {
    private Stack<Integer> first;
    private Stack<Integer> second;
    public QueueUsingStackRemove() {
        first = new Stack<>();
        second = new Stack<>();
    }
    public void add(int itam)  throws Exception{
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        first.push(itam);
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
    }
    public  int remove() throws Exception{
        return first.pop();
    }
    public int peek() throws Exception {
        return first.peek();
    }
    public boolean isEmpty() {
        return first.empty();
    }
}
