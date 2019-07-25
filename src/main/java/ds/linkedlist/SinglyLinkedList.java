package ds.linkedlist;

public class SinglyLinkedList<T> {

    public void addFront(T data) {

        Node<T> node = new Node<>(data);
        if(head==null) {
            head = node;
        }
        else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public T getFirst() {
        if(head == null) {
            throw new RuntimeException("List is empty");
        }
        return head.data;
    }

    public T getLast() {

        if(head == null) {
            throw new RuntimeException("List is empty");
        }
        if(size == 1) {
            return head.data;
        }
        else {

            //iterate through the list and find the last element

            Node<T> currNode = this.head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            return currNode.data;
        }
    }

    public void addLast(T data) {

        Node<T> node = new Node<>(data);
        if(head == null) {
           head = node;
        }
        else {
            Node<T> tmpNode = head;
            while (tmpNode.next != null) {
                tmpNode = tmpNode.next;
            }
            tmpNode.next = node;
        }

        size++;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void deleteFirst() {

        if(head == null) {
            throw new RuntimeException("List is empty!");
        }
        head = head.next;
        size--;
    }

    public void deleteLast() {

        if(head == null) {
            throw new RuntimeException("List is empty!");
        }
        if(size == 1) {
            head = null;
            size = 0;
        }
        else {
            Node<T> tmpNode = head;
            while (true) {
                if(tmpNode.next.next == null) {
                    tmpNode.next = null;
                    break;
                }
                else tmpNode = tmpNode.next;
            }
            size--;

        }
    }

    public void delete(T data) {

        if(head == null) {
            throw new RuntimeException("List is empty!");
        }
        Node<T> tmpNode = head;
        while (tmpNode.next != null) {
            if(tmpNode.next.data.equals(data)) {
                tmpNode.next = tmpNode.next.next;
                size--;
                return;
            }
            tmpNode = tmpNode.next;
        }
        throw new RuntimeException("Data not found");
    }

    static class Node<T> {

        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next=null;
        }
    }

    private Node<T> head;
    private int size;

    public SinglyLinkedList() {
        this.head = null;
        size =0;
    }


}
