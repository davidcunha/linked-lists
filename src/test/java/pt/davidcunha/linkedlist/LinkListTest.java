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
        assertEquals("{30,30.1}{20,20.1}{10,10.1}", list.displayList());
        list.deleteFirst();
        assertEquals("{20,20.1}{10,10.1}", list.displayList());
        list.deleteFirst();
        assertEquals("{10,10.1}", list.displayList());
        list.deleteFirst();
        list.deleteFirst();
    }
}
