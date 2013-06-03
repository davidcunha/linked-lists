package pt.davidcunha.linkedlist;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for double-ended list implementation
 */
public class DoubleEndedListTest {
    
    @Test
    public void setup() {
        DoubleEndedList list = new DoubleEndedList();
        list.insertFirst(10, 10.1);
        list.insertFirst(20, 20.1);
        list.insertFirst(30, 30.1);
        assertEquals("{30,30.1}->{20,20.1}->{10,10.1}->null", list.displayList());
        list.insertLast(40, 40.1);
        assertEquals("{30,30.1}->{20,20.1}->{10,10.1}->{40,40.1}->null", list.displayList());
    }
}
