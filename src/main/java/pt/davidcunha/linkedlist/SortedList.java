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
    public void insert(int id, int dd) {
    }

    /**
     * SortedList delete an element
     *
     * @param id element's id
     */
    public void delete(int id) {
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
