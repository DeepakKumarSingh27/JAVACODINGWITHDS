package RaghusirDataStructure.LinkList;

public class MainRunner {
    public static void main(String[] args) {
        DoubleLinkList list = new DoubleLinkList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.addFirst(0);
       list.display();
        list.add(20,2);
       System.out.println(list.deleteFirst());
        list.display();
        list.reverse();
       list.display();
    }
}
