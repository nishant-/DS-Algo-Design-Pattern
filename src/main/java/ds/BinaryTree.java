package ds;

import java.util.Comparator;

public class BinaryTree<T extends Comparable<T>> {




    private static class Node<T> {
        Node<T> leftChild;
        Node<T> rightChild;
        T data;
    }
}
