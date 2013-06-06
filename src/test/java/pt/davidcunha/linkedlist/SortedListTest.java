package pt.davidcunha.linkedlist;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for linked list implementation
 */
public class SortedListTest {
    
    @Test
    public void setup() {
        SortedList sList = new SortedList();
        sList.insert(30, 30.1);
        sList.insert(40, 40.1);
        sList.insert(10, 10.1);
        sList.insert(20, 20.1);
        sList.insert(50, 50.1);
        assertEquals("{10,10.1}->{20,20.1}->{30,30.1}->{40,40.1}->{50,50.1}->null", sList.displayList());
        sList.delete();
        sList.delete();
        assertEquals("{30,30.1}->{40,40.1}->{50,50.1}->null", sList.displayList());
    }
    
}
