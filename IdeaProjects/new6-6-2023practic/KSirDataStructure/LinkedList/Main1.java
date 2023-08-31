package KSirDataStructure.LinkedList;
public class Main1 {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        //list.displayRev();
        list.insertLast(99);
        list.insert(99,65);
        list.display();
    }
}
