package RaghusirDataStructure.LinkList;

public class DoubleLinkList {
    Node head;
    Node tail;
    public void add(Object data) {
        Node n = new Node(data);
        if (head == null) {
            head = tail = n;
            return;
        }
        n.next = tail.next;
        n.prev = tail;
        tail.next=n;
        tail = n;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" <=> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void addFirst(Object data) {
        Node n = new Node(data);
        if (head == null) {
            head = tail = n;
            return;
        }
        n.next = head;
        head.prev = n;
        head = n;
    }
 public void add(Object data, int in)
 {
   if (in == 0){
       addFirst(data);
       return;
   }
   Node temp = head;
   while (in > 1 && temp != null){
       in--;
       temp = temp.next;
   }
   if (temp == null){
       System.out.println("Index not in range");
   } else {
       Node n = new Node(data);
       n.next = temp.next;
       n.prev = temp;
       temp.next = n;
       if (n.next != null){
           n.next.prev = n;
       } else {
           tail = n;
       }
   }
 }

    public Object deleteFirst() {
        if (head == null) {
            throw new UnsupportedOperationException("List is empty");
        }
        Object data = head.data;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        return data;
    }
   public void reverse()
    {
        reverse(head);
        Node temp = head;
        head = tail;
        tail = temp;
    }
   public void  reverse(Node start){
        while (start != null) {
            Node temp = start.next;
            start.next = start.prev;
            start.prev = temp;
            start = temp;
        }
   }
    class  Node {
        Object data;
        Node next;
        Node prev;
        Node(Object data) {
            this.data = data;
        }
    }
}
