package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Emily Liu
 *
 */

public class InheritanceSortedIntList extends SortedIntList {
    // Write your implementation below with API documentation

    private int addedElems = 0;
    /**
     * Adds the specified int to the list.
     *
     * @param num an integer to be added to the list
     * @return true if the list is changed as a result of the call
     */
    @Override
    public boolean add(int num) {
        boolean success = false;
        if (super.add(num)) {
            success = true;
            this.addedElems += 1;
        }
    
        return success;
    }

    /**
     * Adds all of the elements of the IntegerList to the list.
     *
     * @param list IntegerList containing elements to be added to the list
     * @return true if the list changed as a result of the call
     */
    @Override
    public boolean addAll(IntegerList list) {
        boolean success = false;
        if (super.addAll(list)) {
            success = true;
            this.addedElems += list.size();
        }
    
        return success;
    }


    /**
     * Returns the number of attempted insertions into the list.
     *
     * @return the number of elements that have been added to the list
     */
    public int getTotalAdded() {
        return this.addedElems;
    }



}