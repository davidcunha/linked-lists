package pt.davidcunha.linkedlist;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for linked priority queue implementation
 */
public class LinkedPQueueTest {

    @Test
    public void setup() {
        LinkedPQueue lPriority = new LinkedPQueue();
        lPriority.insert(30, 30.1);
        lPriority.insert(40, 40.1);
        lPriority.insert(10, 10.1);
        lPriority.insert(20, 20.1);
        lPriority.insert(50, 50.1);
        assertEquals("{10,10.1}->{20,20.1}->{30,30.1}->{40,40.1}->{50,50.1}->null", lPriority.peek());
        lPriority.remove();
        lPriority.remove();
        assertEquals("{30,30.1}->{40,40.1}->{50,50.1}->null", lPriority.peek());
    }
}
