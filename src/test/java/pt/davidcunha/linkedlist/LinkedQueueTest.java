package pt.davidcunha.linkedlist;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for linked queue implementation
 */
public class LinkedQueueTest {

    @Test
    public void setup() {
        LinkedQueue lQueue = new LinkedQueue();
        lQueue.insert(10, 10.1);
        lQueue.insert(20, 20.1);
        assertEquals("{10,10.1}->{20,20.1}->null", lQueue.peek());
        lQueue.remove();
        assertEquals("{20,20.1}->null", lQueue.peek());
    }
}
