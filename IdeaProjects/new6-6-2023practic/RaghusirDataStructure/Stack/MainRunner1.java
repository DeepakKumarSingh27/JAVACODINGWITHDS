package RaghusirDataStructure.Stack;

public class MainRunner1 {
    public static void main(String[] args) {
        StackUsingArray stk = new StackUsingArray(5);
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);
        stk.display();
        System.out.println("Pop data is "+stk.pop());
        System.out.println("peek data is "+stk.peek());
        System.out.println("Element is present in offset no  "+stk.search(3));
        System.out.println("size of Stack is "+stk.size());
    }
}
