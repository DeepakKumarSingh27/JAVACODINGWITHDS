package RaghusirDataStructure.LinkList;

import KSirDataStructure.LinkedList.LL;

public class SinglyLinkedList {
    public void add(Object data) {
        Node n = new Node(data);
        if (head == null){
            head = tail = n;
            return;
        }
        tail.next=n;
        tail=n;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void addFirst(Object data) {
        Node n = new Node(data);
        if (head == null){
            head = tail = n;
            return;
        }
        n.next = head;
        head = n;
    }

    public void addLast(Object data) {
        if (tail== null){
            add(data);
            return;
        }
        Node node = new Node(data);
        tail.next=node;
        tail=node;
    }
    public Object deleteFirst(){
        if (head == null) {
            throw new UnsupportedOperationException("List is Empty");
        }
        Object data = head.data;
        head = head.next;
        if (head == null){
            tail = null;
        }
        return data;
    }
    public Object deleteLast() {
        if (head == null){
            throw new UnsupportedOperationException("List is Empty");
        }
       Object data = tail.data;
        Node temp  = head;
        Node prev = null;
        while (temp.next != null){
            prev = temp;
            temp = temp.next;
        }
        tail = prev;
        if (prev != null){
            prev.next = null;
        }
        return data;
    }

    public void reverse() {
        reverse(head);
      Node t = null;
      head = tail;
      tail =t;
    }
    public void reverse(Node start){
        Node t = null;
        Node prev = null;
        while (start != null){
            t = start.next;
            start.next=prev;
            prev=start;
            start=t;
        }
    }

    public Object delete(int in) {
        if (in == 0){
             return deleteFirst();
        }
        return null;
    }

    class Node
    {
        Object data;
        Node next;
        public Node(Object data)
        {
            this.data = data;
        }
    }
    Node head;
    Node tail;
}
