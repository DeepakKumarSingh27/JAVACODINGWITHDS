package com.OOPS.Collcetions;
public class CustomStack {
    protected int[] data;
    int ptr = -1;

    private static final int DEFAULT_SIZE = 10;
    public CustomStack() {
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size) {
        this.data = new int[size];
    }
    public boolean push(int item){
        if (isFull()){
            System.out.println("stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
      public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("cannot pop from an empty stack!!");
        }
//        int removed = data[ptr];
//        ptr--;
        return data[ptr--];
      }
      public  int peek() throws StackException {
          if (isEmpty()) {
              throw new StackException("cannot peek from an empty stack!!");
          }
        return data[ptr];
      }
    public boolean isFull() {
       return ptr == data.length - 1; // last index
    }
    private boolean isEmpty() {
        return ptr == - 1;
    }
}
