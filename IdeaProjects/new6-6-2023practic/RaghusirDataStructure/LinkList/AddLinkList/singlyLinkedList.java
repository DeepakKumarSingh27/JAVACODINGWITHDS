package RaghusirDataStructure.LinkList.AddLinkList;

public class singlyLinkedList {
    Node head;
    Node tail;

    public void add(Object data) {
        Node n = new Node(data);
        if (head == null) {
           head = tail = n;
           return;
        }
        tail.next = n;
        tail = n;
    }
    public singlyLinkedList add(singlyLinkedList l1,singlyLinkedList l2){
        singlyLinkedList sl = new singlyLinkedList();
        int c = 0;
        Node h1 = l1.head,h2=l2.head;
        while (h1 != null && h2 != null) {
            int sum = c + (Integer)h1.data + (Integer)h2.data;
            c = sum/10;
            sl.add(sum%10);
            h1 = h1.next;
            h2 = h2.next;
        }
        while (h1 != null){
            int sum = c + (Integer)h1.data;
            c = sum/10;
            sl.add(sum%10);
            h1 = h1.next;
        }
        while (h2 != null){
            int sum = c + (Integer)h2.data;
            c = sum/10;
            sl.add(sum%10);
            h2 = h2.next;
        }
        if (c != 0){
            sl.add(c);
        }
        return sl;
    }
public void display()
{
   Node temp = head;
   while (temp != null) {
       System.out.print(temp.data+" -> ");
       temp = temp.next;
   }
    System.out.println("END");
}
    class Node {
        Object data;
        Node next;
        Node(Object data) {
            this.data=data;
        }
    }
}
