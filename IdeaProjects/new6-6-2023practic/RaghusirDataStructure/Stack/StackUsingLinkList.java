package RaghusirDataStructure.Stack;

public class StackUsingLinkList {
    class Node {
        Object data;
        Node prev;

        Node(Object data) {
            this.data = data;
        }
    }

    Node top;
    int size;

    public void push(Object data) {
        Node n = new Node(data);
        if (top == null) {
            top = n;
        } else {
            n.prev = top;
            top = n;
        }
        size++;
    }

    public void display() {
        print(top);
        System.out.println();
    }

    public void print(Node start) {
        if (start == null) {
            return;
        }
        print(start.prev);
        System.out.print(start.data + " ");
    }

    public int size() {
        return size;
    }
    public Object pop()
    {
        if (top == null) {
            System.out.println("stack underflow....");
            return null;
        }
        Object data = top.data;
        top = top.prev;
        size--;
        return data;
    }
    public  Object peek(){
        if (top == null){
            System.out.println("stack underflow....");
            return null;
        }
      //  Object data = top.data;
        return top.data;
    }
    public int search(Object data) {
        Node temp = top;
        int i =0;
        while (temp!=null){
          i++;
          if (temp.data == data){
              return i;
          }
            temp = temp.prev;
        }
        return 0;
    }
}
