package pt.davidcunha.linkedlist;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for linked stack implementation
 */
public class LinkedStackTest {
    
    @Test
    public void setup() {
        LinkedStack lStack = new LinkedStack();
        lStack.push(10, 10.1);
        lStack.push(20, 20.1);
        assertEquals("{20,20.1}->{10,10.1}->null", lStack.peek());
        lStack.pop();
        assertEquals("{10,10.1}->null", lStack.peek());
    }
}
