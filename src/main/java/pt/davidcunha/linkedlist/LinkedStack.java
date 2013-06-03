/**
 * Linked Lists - stack using a linked list
 */
package pt.davidcunha.linkedlist;

/**
 *
 * @author David Cunha <davidgoncalvescunha AT gmail DOT pt>
 */
public class LinkedStack {

    private LinkList stackLinkList;

    /**
     * LinkedStack public constructor
     *
     * @param size structure initialization
     */
    public LinkedStack(int size) {
        this.stackLinkList = new LinkList();
    }

    /**
     * Stack push
     *
     * @param id append id type to the stack
     * @param dd append data type to the stack
     */
    public void push(int id, int dd) {
        this.stackLinkList.insertFirst(id, dd);
    }

    /**
     * Stack pop
     *
     * @return last inserted element
     */
    public Link pop() {
        Link link = null;
        if (isEmpty()) {
            throw new IllegalStateException("stack is empty");
        } else {
            link = this.stackLinkList.deleteFirst();
        }
        return link;
    }

    /**
     * Stack peek stack
     *
     * @return elements from the stack
     */
    public String peek() {
        return this.stackLinkList.displayList();
    }

    /**
     * Stack is empty?
     *
     * @return true or false
     */
    public boolean isEmpty() {
        return (this.stackLinkList.isEmpty());
    }

}
