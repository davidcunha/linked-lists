/**
 * Linked Lists - link implementation
 */
package pt.davidcunha.linkedlist;

/**
 *
 * @author David Cunha <davidgoncalvescunha AT gmail DOT pt>
 */
public class Link {

    private int iData;
    private double dData;
    private Link next;

    public Link(int id, double dd) {
        this.iData = id;
        this.dData = dd;
    }

    public int getiData() {
        return iData;
    }

    public double getdData() {
        return dData;
    }

    public Link getNext() {
        return next;
    }
}
