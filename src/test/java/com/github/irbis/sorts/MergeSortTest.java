package com.github.irbis.sorts;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author A.Nadtochey<irbis@github.com>
 */
public class MergeSortTest {
    
    public MergeSortTest() {
    }

    @Test
    public void testSort() {
        Integer[] array = new Integer[] {1, 3, 5, 8, 2, 7, 4, 6};
        MergeSort<Integer> mergeSort = new MergeSort<Integer>(array);
        
        assertArrayEquals(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8}, 
                mergeSort.sort());
    }
    
    @Test
    public void testSortEmptyArray() {
        Integer[] array = {};
        
        MergeSort<Integer> mergeSort = new MergeSort<Integer>(array);
        assertEquals(0, mergeSort.sort().length);
    }
}
