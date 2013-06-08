/**
 * Linked Lists - link implementation for doubly linked lists
 */
package pt.davidcunha.linkedlist;

/**
 *
 * @author David Cunha <davidgoncalvescunha AT gmail DOT pt>
 */
public class LinkD {

    private int iData;
    private double dData;
    private LinkD next;
    private LinkD previous;

    public LinkD(int id, double dd) {
        this.iData = id;
        this.dData = dd;
    }

    public int getiData() {
        return iData;
    }

    public double getdData() {
        return dData;
    }

    public LinkD getNext() {
        return next;
    }

    public void setNext(LinkD next) {
        this.next = next;
    }

    public LinkD getPrevious() {
        return previous;
    }

    public void setPrevious(LinkD previous) {
        this.previous = previous;
    }

    public String toString() {
        return "{" + this.getiData() + "," + this.getdData() + "}";
    }
}
