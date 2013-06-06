/**
 * Linked Lists - sorted list implementation
 */
package pt.davidcunha.linkedlist;

/**
 *
 * @author David Cunha <davidgoncalvescunha AT gmail DOT pt>
 */
public class SortedList {

    private Link first;

    /**
     * SortedList public constructor
     *
     */
    public SortedList() {
        this.first = null;
    }

    /**
     * SortedList insert element
     *
     * @param id element's id
     * @param dd element's data
     */
    public void insert(int id, double dd) {
        Link newLink = new Link(id, dd);
        Link current = this.first;
        Link previous = null;

        while (current != null && id > current.getiData()) {
            previous = current;
            current = current.getNext(); //iterate over the linked list
        }
        if (previous == null) {
            this.first = newLink; //new link becomes the first link
        } else {
            previous.setNext(newLink); //set previous next link to new link
        }
        newLink.setNext(current); //assign next to actual link
    }

    /**
     * SortedList delete first element
     *
     * @return deleted element
     */
    public Link delete() {
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
     * SortedList display entire list
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
     * SortedList is empty?
     *
     * @return true or false
     */
    public boolean isEmpty() {
        return (first == null);
    }
}
