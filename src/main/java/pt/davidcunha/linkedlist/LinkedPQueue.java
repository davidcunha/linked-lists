/**
 * Linked Lists - priority queue using a linked list
 */
package pt.davidcunha.linkedlist;

/**
 *
 * @author David Cunha <davidgoncalvescunha AT gmail DOT pt>
 */
public class LinkedPQueue {
    
 private SortedList pqueueLinkList;

    /**
     * LinkedPQueue public constructor
     *
     */
    public LinkedPQueue() {
        this.pqueueLinkList = new SortedList();
    }

    /**
     * Insert new element in the queue.
     *
     * @param id append id type to the queue
     * @param dd append data type to the queue
     */
    public void insert(int id, double dd) {
        this.pqueueLinkList.insert(id, dd);
    }

    /**
     * Remove front of the queue
     *
     * @return first element
     */
    public Link remove() {
        return this.pqueueLinkList.deleteFirst();
    }

    /**
     * Queue peek queue
     *
     * @return elements from the queue
     */
    public String peek() {
        return this.pqueueLinkList.displayList();
    }

    /**
     * Queue is empty?
     *
     * @return true or false
     */
    public boolean isEmpty() {
        return (this.pqueueLinkList.isEmpty());
    }
}


