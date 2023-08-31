package RaghusirDataStructure.LinkList;
import RaghusirDataStructure.LinkList.AddLinkList.singlyLinkedList;
public class addLinkList {
    public static void main(String[] args) {
        singlyLinkedList list1 = new singlyLinkedList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.display();
        singlyLinkedList list2 = new singlyLinkedList();
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);
        list2.display();
        singlyLinkedList list = new singlyLinkedList();
        list = list.add(list1,list2);
        //System.out.println(list);
         list.display();
    }

}
