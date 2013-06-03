package pt.davidcunha.linkedlist;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for linked list implementation
 */
public class LinkListTest {

    @Test(expected = IllegalStateException.class)
    public void setup() {
        LinkList list = new LinkList();
        list.insertFirst(10, 10.1);
        list.insertFirst(20, 20.1);
        list.insertFirst(30, 30.1);
        list.delete(20);
        assertEquals("{10,10.1}", list.find(10));
        assertEquals("{30,30.1}->{10,10.1}->null", list.displayList());
        list.deleteFirst();
        assertEquals("{10,10.1}->null", list.displayList());
        list.deleteFirst();
        list.deleteFirst();
    }
}
