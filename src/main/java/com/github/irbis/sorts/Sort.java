package com.github.irbis.sorts;

/**
 * Base class for the sorting algorithms.
 * 
 * @author A.Nadtochey<irbis@github.com>
 */
public abstract class Sort<T extends Comparable> {
    protected final T[] elements;

    public Sort(T[] elements) {
        this.elements = elements;
    }

    protected void swap(int currentIndex, int i) {
        T buf = elements[currentIndex];
        elements[currentIndex] = elements[i];
        elements[i] = buf;
    }
    
    public abstract T[] sort();
}
