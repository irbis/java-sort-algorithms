package com.github.irbis.sorts;

/**
 * Quick sort. Well known and widely spread algorithm. Java has it own 
 * implementation.
 * 
 * @author A.Nadtochey<irbis@github.com>
 */
public class QuickSort<T extends Comparable> extends Sort<T> {
    public QuickSort(T[] elements) {
        super(elements);
    }
    
    @Override
    public T[] sort() {
        sort(0, elements.length - 1);
        return elements;
    }
    
    private void sort(int left, int right) {
        T pivotElement = elements[getPivotIndex(left, right)];
        int leftIndex = left;
        int rightIndex = right;
        
        do {
            while (elements[leftIndex].compareTo(pivotElement) < 0) ++leftIndex;
            while (elements[rightIndex].compareTo(pivotElement) > 0) --rightIndex;
            
            if (leftIndex <= rightIndex) {
                swap(leftIndex, rightIndex);
                ++leftIndex; --rightIndex;
            }
        } while (leftIndex <= rightIndex);

        if (left < rightIndex) sort(left, rightIndex);
        if (leftIndex < right) sort(leftIndex, right);
    }
    
    private int getPivotIndex(int left, int right) {
        return (left+right) / 2;
    }
}
