package ds.tree;

public class BinaryTree<T extends Comparable<T>> {

    private BTNode<T> rootNode;

    public BTNode getRootNode() {
        return rootNode;
    }

    public void setRootNode(BTNode rootNode) {
        this.rootNode = rootNode;
    }

    public void insert(T key) {

        BTNode tNode = new BTNode(key);
        insert(this, tNode);
    }

    private void insert(BinaryTree<T> binaryTree, BTNode tNode) {

        //get the root node
        BTNode<T> rootNode = binaryTree.getRootNode();
        if(rootNode == null) {
            // tree is empty
            binaryTree.setRootNode(tNode);
            return;
        }
        else {
            // insert the key at correct position
            BTNode<T> tmp = rootNode;
            BTNode<T> parent;
            while(true) {
                parent = tmp;
                if(tNode.data.compareTo(parent.data) > 0) {
                    //go right
                    tmp = tmp.rightChild;
                    if (tmp == null) {
                        parent.rightChild = tNode;
                        return;
                    }
                }
                    else { // go left
                        tmp = tmp.leftChild;
                        if(tmp == null) {
                            parent.leftChild = tNode;
                            return;
                        }
                    }
                }
            }
        }


     static class BTNode<T extends Comparable<T>> {
        BTNode<T> leftChild;
        BTNode<T> rightChild;
        T data;

        public BTNode(T data) {
            this.data = data;
            leftChild = null;
            rightChild = null;
        }
    }

    public void inOrderTraversal() {
        inOrderTraversal(this.getRootNode());
    }

    private void inOrderTraversal(BTNode<T> node) {

        if(node == null)
            return;
        inOrderTraversal(node.leftChild);
        System.out.println(node.data);
        inOrderTraversal(node.rightChild);

    }

    //returns total number of nodes in a tree
    public int size() {
        return size(this.getRootNode());
    }

    private int size(BTNode<T> node) {

        return (node == null) ? 0 : (size(node.rightChild) + size(node.leftChild) + 1);
    }



}
