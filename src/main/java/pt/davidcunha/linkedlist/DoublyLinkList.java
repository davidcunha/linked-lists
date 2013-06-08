/**
 * Linked Lists - doubly linked list implementation
 */
package pt.davidcunha.linkedlist;

/**
 *
 * @author David Cunha <davidgoncalvescunha AT gmail DOT pt>
 */
public class DoublyLinkList {

    private LinkD first;
    private LinkD last;

    /**
     * DoublyLinkList public constructor
     *
     */
    public DoublyLinkList() {
        this.first = null;
        this.last = null;
    }

    /**
     * DoublyLinkList insert first element
     *
     * @param id element's id
     * @param dd element's data
     */
    public void insertFirst(int id, double dd) {
        LinkD newLink = new LinkD(id, dd);
        if (isEmpty()) {
            this.last = newLink; //new link becomes the last link
        } else {
            this.first.setPrevious(newLink); //assign previous from actual first link to new link
        }
        newLink.setNext(this.first); //assign next to actual first link
        this.first = newLink; //new link becomes the first link
    }

    /**
     * DoublyLinkList insert last element
     *
     * @param id element's id
     * @param dd element's data
     */
    public void insertLast(int id, double dd) {
        LinkD newLink = new LinkD(id, dd);
        if (isEmpty()) {
            this.first = newLink; //new link becomes the first link
        } else {
            this.last.setNext(newLink); //set actual last next link to new link
            newLink.setPrevious(this.last); //assign previous from new link to actual last link
        }
        this.last = newLink; //new link becomes the last link
    }

    /**
     * DoublyLinkList insert element
     *
     * @param id element's id
     * @param dd element's data
     * @param cid previous element's id
     */
    public void insert(int id, double dd, int cid) {
        LinkD newLink = new LinkD(id, dd);
        LinkD current = this.first;

        while (current.getiData() != cid) {
            if (current.getNext() == null) {
                throw new IllegalStateException("link doesn't exist");
            } else {
                current = current.getNext(); //iterate over the linked list
            }
        }
        
        if(current == this.last) {
            this.last = newLink;
        } else {
           newLink.setNext(current.getNext());
           current.getNext().setPrevious(newLink);
        }
        current.setNext(newLink);
        newLink.setPrevious(current);
    }

    /**
     * DoublyLinkList display entire list (forward)
     *
     * @return all linked list elements
     */
    public String displayForward() {
        LinkD current = this.first;
        StringBuilder output = new StringBuilder();

        while (current != null) {
            output.append(current.toString()).append("->"); //append link information
            current = current.getNext(); //iterate over the linked list
        }

        return output.append("null").toString();
    }

    /**
     * DoublyLinkList display entire list (backward)
     *
     * @return all linked list elements
     */
    public String displayBackward() {
        LinkD current = this.last;
        StringBuilder output = new StringBuilder();

        while (current != null) {
            output.append(current.toString()).append("->"); //append link information
            current = current.getPrevious(); //iterate over the linked list
        }

        return output.append("null").toString();
    }

    /**
     * DoublyLinkList is empty?
     *
     * @return true or false
     */
    public boolean isEmpty() {
        return (first == null);
    }
}
