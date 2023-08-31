package KSirDataStructure.Tree;

public class AVLMain {
    public static void main(String[] args) {
        AVL tree = new AVL();
        for (int i = 0; i < 1000; i++) {
            tree.insert(i);
        }
        tree.display();
        System.out.println(tree.height());
    }
}
