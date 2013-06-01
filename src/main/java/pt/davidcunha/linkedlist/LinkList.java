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
        newLink.setNext(this.first); //assign next to actual first link
        this.first = newLink; //new link becomes the first link
    }

    public void deleteFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("linked list is empty");
        } else {
            Link temp = this.first; //get actual first link
            this.first = temp.getNext(); //next link becomes the first link
        }
    }

    public String displayList() {
        Link current = this.first;
        StringBuilder output = new StringBuilder();

        while (current != null) {
            String link = "{"
                    + current.getiData()
                    + ","
                    + current.getdData() + "}";
            output.append(link);
            current = current.getNext(); //iterate over the linked list
        }
        
        return output.toString();
    }
}
