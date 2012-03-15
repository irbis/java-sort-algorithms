package com.github.irbis.sorts;

/**
 *
 * Buble sort is one of the simplest sorting algorithm. Buble sort is 
 * uneffective.
 * 
 * @author A.Nadtochey<irbis@github.com>
 */
public class BubleSort<T extends Comparable> extends Sort<T> {
    
    public BubleSort(T[] elements) {
        super(elements);
    }
    
    @Override
    public T[] sort() {
        
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = 0; i < elements.length - 1; i++)
                if (elements[i].compareTo(elements[i+1]) > 0) {
                    swap(i, i+1);
                    swap = true;
                }
        }

        return elements;
    }
    
}
