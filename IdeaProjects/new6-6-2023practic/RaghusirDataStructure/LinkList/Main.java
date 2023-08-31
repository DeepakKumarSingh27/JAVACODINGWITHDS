package RaghusirDataStructure.LinkList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.display();
       // list.addFirst(0);
        //list.display();
        list.addLast(5);
        list.display();
      //  list.display();
       // System.out.println(list.deleteFirst());
      //  list.display();
      //  System.out.println(list.deleteLast());
      //  list.display();
        //list.reverse();
       // list.display();
        list.delete(3);
        list.display();
    }
}
