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

        if (current == this.last) {
            newLink.setNext(null);
            this.last = newLink; //new link becomes the last link
        } else {
            newLink.setNext(current.getNext()); //set actual current's next link as the new link's next link 
            current.getNext().setPrevious(newLink); //set new link as the previous from the current's next link
        }
        current.setNext(newLink); //assign new link as the actual current's next link
        newLink.setPrevious(current); //set current as the new link's previous link
    }

    /**
     * DoublyLinkList first element
     *
     * @return deleted element
     */
    public LinkD deleteFirst() {
        LinkD tmp = this.first;
        if (isEmpty()) {
            throw new IllegalStateException("linked list is empty");
        } else {
            if (this.first == null) {
                this.last = null;
            } else {
                this.first.getNext().setPrevious(null); //set null as the previous from the first's next link 
            }
            this.first = this.first.getNext(); //next link becomes the first link
        }
        return tmp;
    }

    /**
     * DoublyLinkList delete last element
     *
     * @return deleted element
     */
    public LinkD deleteLast() {
        LinkD tmp = this.last;
        if (isEmpty()) {
            throw new IllegalStateException("linked list is empty");
        } else {
            if (this.first.getNext() == null) {
                this.first = null;
            } else {
                this.last.getPrevious().setNext(null); //set null as the next from the last's previous link 
            }
            this.last = this.last.getPrevious(); //previous last link becomes the last link
        }
        return tmp;
    }

    /**
     * DoublyLinkList delete element
     *
     * @param id element's id
     *
     * @return deleted element
     */
    public LinkD delete(int id) {
        LinkD current = this.first;

        while (current.getiData() != id) {
            if (current.getNext() == null) {
                throw new IllegalStateException("link doesn't exist");
            } else {
                current = current.getNext(); //iterate over the linked list
            }
        }

        if (current == this.first) {
            this.first = current.getNext(); //next link becomes the first link
        }
        if (current == this.last) {
            this.last = current.getPrevious(); //previous link becomes the last link
        } else {
            current.getPrevious().setNext(current.getNext()); //set current's next link as the next link from the current's previous link
            current.getNext().setPrevious(current.getPrevious()); //set current's previous link as the previous link from the current's next link
        }

        return current;
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
