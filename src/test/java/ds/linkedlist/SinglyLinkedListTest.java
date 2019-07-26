package ds.linkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class SinglyLinkedListTest {

    SinglyLinkedList<Integer> singlyLinkedList;
    SinglyLinkedList<String> singlyLinkedListString;

    @Before
    public void setUp() {

        singlyLinkedList = new SinglyLinkedList<>();
    }

    @Test
    public void addFrontToList() {

        singlyLinkedList.addFront(1);
        singlyLinkedList.addFront(2);
        Assert.assertEquals(2, singlyLinkedList.size());

    }

    @Test
    public void getFirstFromList() {
        singlyLinkedList.addFront(1);
        singlyLinkedList.addFront(2);
        int data =singlyLinkedList.getFirst();
        Assert.assertEquals(2, data);
    }

    @Test
    public void getLastFromList() {
        singlyLinkedList.addFront(1);
        singlyLinkedList.addFront(2);
        int data = singlyLinkedList.getLast();
        Assert.assertEquals(1,data);
    }

    @Test
    public void addToEndOfList() {
        singlyLinkedList.addLast(1);
        singlyLinkedList.addLast(2);
        singlyLinkedList.addLast(3);
        int data = singlyLinkedList.getLast();
        Assert.assertEquals(3 , data);
    }

    @Test
    public void clearList() {
        singlyLinkedList.addLast(1);
        singlyLinkedList.addLast(2);
        singlyLinkedList.addLast(3);
        singlyLinkedList.clear();

        Assert.assertEquals(0, singlyLinkedList.size());
    }

    @Test
    public void deleteFirstFromList() {
        singlyLinkedList.addLast(1);
        singlyLinkedList.addLast(2);
        singlyLinkedList.addLast(3);
        singlyLinkedList.deleteFirst();
        int data = singlyLinkedList.getFirst();

        Assert.assertEquals(2, data);
    }

    @Test
    public void deleteLastFromList() {

        singlyLinkedList.addLast(1);
        singlyLinkedList.addLast(2);
        singlyLinkedList.addLast(3);
        singlyLinkedList.deleteLast();
        int data = singlyLinkedList.getLast();

        Assert.assertEquals(2,data);

    }

    @Test
    public void deleteByData() {
        singlyLinkedList.addLast(1);
        singlyLinkedList.addLast(2);
        singlyLinkedList.delete(2);

        int first = singlyLinkedList.getFirst();
        int last = singlyLinkedList.getLast();

        Assert.assertEquals(1,first);
        Assert.assertEquals(1, last);



    }

}