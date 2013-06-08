package pt.davidcunha.linkedlist;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for linked list implementation
 */
public class SortedListTest {
    
    @Test
    public void setup() {
        SortedList lSorted = new SortedList();
        lSorted.insert(30, 30.1);
        lSorted.insert(40, 40.1);
        lSorted.insert(10, 10.1);
        lSorted.insert(20, 20.1);
        lSorted.insert(50, 50.1);
        assertEquals("{10,10.1}->{20,20.1}->{30,30.1}->{40,40.1}->{50,50.1}->null", lSorted.displayList());
        lSorted.deleteFirst();
        lSorted.deleteFirst();
        assertEquals("{30,30.1}->{40,40.1}->{50,50.1}->null", lSorted.displayList());
    }
    
}
