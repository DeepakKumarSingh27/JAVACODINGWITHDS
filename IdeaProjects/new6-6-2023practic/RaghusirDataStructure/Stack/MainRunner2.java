package RaghusirDataStructure.Stack;
public class MainRunner2 {
    public static void main(String[] args) {
        StackUsingLinkList stk = new StackUsingLinkList();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);
        stk.display();
        System.out.println("size is "+stk.size());
        System.out.println("Deleted Node is "+stk.pop());
        System.out.println("Top Node is "+stk.peek());
        System.out.println(stk.search(2));
    }
}
