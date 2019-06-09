package ds;

public class SinglyLinkedList<T> {

    private Node<T> head;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            next = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }

    public int getListSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public void add(T data) {
        //create node
        Node<T> node = new Node<>(data);
        if (head == null) {
                setHead(node);
                size++;
                return;
        } else {
            //go to end of list
            Node<T> tmp = getHead();//set starting reference to head of the list
            while (true) {
                if (tmp.next == null) { //if end of the list is found
                        tmp.next = node; //now, the end of list points to the new node.
                        break;
                }
                tmp = tmp.next; //move to the next node in the list
            }
            size++;
        }
    }

    //implement delete method
    //implement reverse method


    public void display() {
        Node<T> tmp = getHead();
        while (tmp != null) {
            System.out.print(tmp.data + "-->");
            tmp = tmp.next;
        }
        System.out.print("null");
    }

    //precondition : T must implement equals method, otherwise objects can't be compared

    public int delete(T data) {
        if (getListSize() == 0)
            throw new RuntimeException("List is empty");
        Node<T> node = getHead();
        if(node.getData().equals(data)){
            setHead(node.next);
            size--;
            return 1;
        }
        while (node.next != null) {
            if (node.next.getData().equals(data)) {
                    node.next = node.next.next; //set the next reference to the item next to the list
                    size--;
                    return 1;
            }
            node = node.next;
        }
        return -1;
    }



    public static void main(String[] args) {

        SinglyLinkedList<String> stringSinglyLinkedList = new SinglyLinkedList<>();
        stringSinglyLinkedList.add("a");
        stringSinglyLinkedList.add("b");
        stringSinglyLinkedList.add("c");
        stringSinglyLinkedList.display();
        System.out.println();
        stringSinglyLinkedList.delete("a");
        stringSinglyLinkedList.display();
        System.out.println();
        stringSinglyLinkedList.delete("b");
        stringSinglyLinkedList.display();
        System.out.println();
        stringSinglyLinkedList.delete("c");
        stringSinglyLinkedList.display();
        System.out.println();
    }
}
