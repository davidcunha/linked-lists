/**
 * Linked Lists - linked list implementation
 */
package pt.davidcunha.linkedlist;

/**
 *
 * @author David Cunha <davidgoncalvescunha AT gmail DOT pt>
 */
public class LinkList {

    private Link first;

    /**
     * LinkList public constructor
     *
     */
    public LinkList() {
        this.first = null;
    }

    /**
     * LinkList insert first element
     *
     * @param id element's id
     * @param dd element's data
     */
    public void insertFirst(int id, double dd) {
        Link newLink = new Link(id, dd);
        newLink.setNext(this.first); //assign first link as the next link from the new link
        this.first = newLink; //new link becomes the first link
    }

    /**
     * LinkList find an element
     *
     * @param id element's id
     */
    public Link find(int id) {
        Link current = this.first;

        while (current.getiData() != id) {
            if (current.getNext() == null) {
                throw new IllegalStateException("link doesn't exist");
            } else {
                current = current.getNext(); //iterate over the linked list
            }
        }

        return current;
    }

    /**
     * LinkList delete first element
     *
     * @return deleted element
     */
    public Link deleteFirst() {
        Link temp = this.first;
        if (isEmpty()) {
            throw new IllegalStateException("linked list is empty");
        } else {
            temp = this.first; //get actual first link
            this.first = temp.getNext(); //next link becomes the first link
        }
        return temp;
    }

    /**
     * LinkList delete an element
     *
     * @param id element's id
     */
    public void delete(int id) {
        Link current = this.first;
        Link previous = this.first;

        while (current.getiData() != id) {
            if (current.getNext() == null) {
                throw new IllegalStateException("link doesn't exist");
            } else {
                previous = current;
                current = current.getNext(); //iterate over the linked list
            }
        }
        if (current == this.first) {
            this.first = current.getNext(); //next link becomes the first link
        } else {
            previous.setNext(current.getNext()); //set current's next link as the next link from the previous link
        }
    }

    /**
     * LinkList display entire list
     *
     * @return all linked list elements
     */
    public String displayList() {
        Link current = this.first;
        StringBuilder output = new StringBuilder();

        while (current != null) {
            output.append(current.toString()).append("->"); //append link information
            current = current.getNext(); //iterate over the linked list
        }

        return output.append("null").toString();
    }

    /**
     * LinkList is empty?
     *
     * @return true or false
     */
    public boolean isEmpty() {
        return (first == null);
    }
}
