package com.github.irbis.sorts;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author A.Nadtochey<irbis@github.com>
 */
public class QuickSortTest {

    @Test
    public void testSortShortArray() {
        Integer[] array = new Integer[] {1, 7, 6, 3, 5, 2, 4, 8, 9 };
        QuickSort<Integer> quickSort = new QuickSort<Integer>(array);
        quickSort.sort();
        
        assertArrayEquals(new Integer [] {1, 2, 3, 4, 5, 6, 7, 8, 9}, array);
        assertTrue(SortUtilities.isSortedArray(array));
    }

    @Test
    public void testSortShortSortedArray() {
        Integer[] array = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        QuickSort<Integer> quickSort = new QuickSort<Integer>(array);
        quickSort.sort();
        
        assertArrayEquals(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, array);
        assertTrue(SortUtilities.isSortedArray(array));
    }

    @Test
    public void testSortShortSortedBackArray() {
        Integer[] array = new Integer[] {9, 8, 7, 6, 5, 4, 3, 2, 1};
        QuickSort<Integer> quickSort = new QuickSort<Integer>(array);
        quickSort.sort();
        
        assertArrayEquals(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, array);
        assertTrue(SortUtilities.isSortedArray(array));
    }

    @Test
    public void testSortShortArray1() {
        Integer[] array = new Integer[] {1, 7, 6, 3, 5, 2, 4, 8};
        QuickSort<Integer> quickSort = new QuickSort<Integer>(array);
        quickSort.sort();
        
        assertArrayEquals(new Integer [] {1, 2, 3, 4, 5, 6, 7, 8}, array);
        assertTrue(SortUtilities.isSortedArray(array));
    }
    
    @Test
    public void testSortSmallArray() {
        Integer[] array = SortUtilities.generateNumbers(100);
        QuickSort<Integer> quickSort = new QuickSort<Integer>(array);
        quickSort.sort();
        
        assertTrue(SortUtilities.isSortedArray(array));
    }
    
    @Test
    public void testSortMediumArray() {
        Integer[] array = SortUtilities.generateNumbers(1000);
        QuickSort<Integer> quickSort = new QuickSort<Integer>(array);
        quickSort.sort();
        
        assertTrue(SortUtilities.isSortedArray(array));
    }
    
    @Test
    public void testSortBigArray() {
        Integer[] array = SortUtilities.generateNumbers(10000);
        QuickSort<Integer> quickSort = new QuickSort<Integer>(array);
        quickSort.sort();
        
        assertTrue(SortUtilities.isSortedArray(array));
    }
    
}
