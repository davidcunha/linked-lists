package pt.davidcunha.linkedlist;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for doubly linked list implementation
 */
public class DoublyLinkListTest {

    @Test
    public void setup() {
        DoublyLinkList dLList = new DoublyLinkList();
        dLList.insertFirst(10, 10.1);
        dLList.insertFirst(20, 20.1);
        assertEquals("{20,20.1}->{10,10.1}->null", dLList.displayForward());
        assertEquals("{10,10.1}->{20,20.1}->null", dLList.displayBackward());
        dLList.insertLast(30, 30.1);
        assertEquals("{20,20.1}->{10,10.1}->{30,30.1}->null", dLList.displayForward());
        assertEquals("{30,30.1}->{10,10.1}->{20,20.1}->null", dLList.displayBackward());
        dLList.insert(40, 40.1, 10);
        dLList.insert(50, 50.1, 30);
        assertEquals("{20,20.1}->{10,10.1}->{40,40.1}->{30,30.1}->{50,50.1}->null", dLList.displayForward());
        assertEquals("{50,50.1}->{30,30.1}->{40,40.1}->{10,10.1}->{20,20.1}->null", dLList.displayBackward());
    }
}
