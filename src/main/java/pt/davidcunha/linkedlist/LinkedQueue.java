/**
 * Linked Lists - queue using a linked list
 */
package pt.davidcunha.linkedlist;

/**
 *
 * @author David Cunha <davidgoncalvescunha AT gmail DOT pt>
 */
public class LinkedQueue {
    
  private DoubleEndedList queueLinkList;

    /**
     * LinkedQueue public constructor
     *
     */
    public LinkedQueue() {
        this.queueLinkList = new DoubleEndedList();
    }

    /**
     * Insert new element in the queue.
     *
     * @param id append id type to the stack
     * @param dd append data type to the stack
     */
    public void insert(int id, double dd) {
        this.queueLinkList.insertLast(id, dd);
    }

    /**
     * Remove front of the queue
     *
     * @return first element
     */
    public String remove() {
        return this.queueLinkList.deleteFirst();
    }

    /**
     * Queue peek queue
     *
     * @return elements from the queue
     */
    public String peek() {
        return this.queueLinkList.displayList();
    }

    /**
     * Queue is empty?
     *
     * @return true or false
     */
    public boolean isEmpty() {
        return (this.queueLinkList.isEmpty());
    }
}

