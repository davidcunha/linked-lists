/**
 * Linked Lists - double-ended list implementation
 */
package pt.davidcunha.linkedlist;

/**
 *
 * @author David Cunha <davidgoncalvescunha AT gmail DOT pt>
 */
public class DoubleEndedList {

    private Link first;
    private Link last;

    /**
     * DoubleEndedList public constructor
     *
     */
    public DoubleEndedList() {
        this.first = null;
        this.last = null;
    }

    /**
     * DoubleEndedList insert first element
     *
     * @param id element's id
     * @param dd element's data
     */
    public void insertFirst(int id, double dd) {
        Link newLink = new Link(id, dd);
        if (isEmpty()) {
            this.last = newLink; //first link becomes the last link
        }
        newLink.setNext(this.first); //assign next to actual first link
        this.first = newLink; //new link becomes the first link
    }

    /**
     * DoubleEndedList insert last element
     *
     * @param id element's id
     * @param dd element's data
     */
    public void insertLast(int id, double dd) {
        Link newLink = new Link(id, dd);
        if (isEmpty()) {
            this.first = newLink; //new link becomes the first link 
        } else {
            this.last.setNext(newLink); //set actual last next link to new link
        }
        this.last = newLink; //new link becomes the last link
    }

    /**
     * DoubleEndedList find an element
     *
     * @param id element's id
     * 
     * @return element
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
     * DoubleEndedList delete first element
     *
     * @return deleted element
     */
    public Link deleteFirst() {
        Link temp = null;
        if (isEmpty()) {
            throw new IllegalStateException("linked list is empty");
        } else {
            temp = this.first; //get actual first link
            this.first = temp.getNext(); //next link becomes the first link
        }
        return temp;
    }

    /**
     * DoubleEndedList delete an element
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
                previous.setNext(current.getNext()); //set previous next link to current next link
            }
        }
    }

    /**
     * DoubleEndedList display entire list
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
     * DoubleEndedList is empty?
     *
     * @return true or false
     */
    public boolean isEmpty() {
        return (first == null && last == null);
    }
}
