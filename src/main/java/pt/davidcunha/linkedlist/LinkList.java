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

    public LinkList() {
        this.first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int id, double dd) {
        Link newLink = new Link(id, dd);
        Link next = newLink.getNext();
        next = this.first; //assign next to actual first link
        this.first = newLink; //new link becomes the first link
    }

    public void deleteFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("linked list is empty");
        } else {
            Link temp = this.first;
            this.first = temp.getNext();
        }
    }
}
