package RaghusirDataStructure.Stack;

public class StackUsingArray {
    Object[] obj;
    int capacity;
    int top;

    public StackUsingArray(int capacity) {
        this.capacity = capacity;
        obj = new Object[capacity];
        top = -1;
    }
    public void push(Object data){
       if (top == capacity -1){
           System.out.println("Stack OverFlow.....");
           return;
       }
       obj[++top] = data;
    }
    public void display() {
        for (int i = 0; i <=top; i++) {
            System.out.print(obj[i]+" ");
        }
        System.out.println();
    }
    public Object pop() {
        if (top == -1){
            System.out.println("Stack UnderFlow.....");
            return null;
        }
        return obj[top--];
    }
    public Object peek(){
        if (top == -1){
            System.out.println("Stack UnderFlow.....");
            return null;
        }
        return obj[top];
    }
    public int search(Object data) {
        for (int i = top; i >=0 ; i--) {
            if (obj[i] == data){
                return top - i + 1;
            }
        }
        return 0;
    }
    public int  size(){
        return  top + 1;
    }
}
