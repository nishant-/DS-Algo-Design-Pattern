package ds.tree;

public class TestBtree {

    public static void main(String[] args) {

        BinaryTree<Integer> btree = new BinaryTree<>();
        btree.insert(5);
        btree.insert(6);
        btree.insert(3);
        btree.insert(4);
        btree.insert(2);


        btree.inOrderTraversal();
        System.out.println(btree.nodeCount());

        System.out.println(btree.countLeftNodes());



    }
}
