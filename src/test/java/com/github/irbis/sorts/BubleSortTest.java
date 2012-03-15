package com.github.irbis.sorts;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author A.Nadtochey<irbis@github.com>
 */
public class BubleSortTest {
    
    @Test
    public void testSortEmpyArray() {
        BubleSort<Integer> bubleSort = new BubleSort<Integer>(new Integer[] {});
        assertEquals(0, bubleSort.sort().length);
    }
    
    @Test
    public void testSortArrayWithOneElement() {
        BubleSort<Integer> bubleSort = new BubleSort<Integer>(new Integer[]{1});
        assertArrayEquals(new Integer[]{1}, bubleSort.sort());
    }
    
    @Test
    public void testSortArrayWithTwoElemets() {
        BubleSort<Integer> bubleSort = new BubleSort<Integer>(
                new Integer[] {2, 1});
        assertArrayEquals(new Integer[] {1, 2}, bubleSort.sort());
    }
    
    @Test
    public void testSort1() {
        BubleSort<Integer> bubleSort = new BubleSort<Integer>(new Integer[] {
            0, 1, 2, 3, 4, 5});
        Integer[] array = bubleSort.sort();
        
        assertArrayEquals(new Integer[] {0, 1, 2, 3, 4, 5}, array);
    }
    
    @Test
    public void testSort2() {
        BubleSort<Integer> bubleSort = new BubleSort<Integer>(
                new Integer[] {5, 4, 3, 2, 1, 0});
        Integer[] array = bubleSort.sort();
        
        assertArrayEquals(new Integer[] {0, 1, 2, 3, 4, 5}, array);
    }

    @Test
    public void testSort3() {
        BubleSort<Integer> bubleSort = new BubleSort<Integer>(
                new Integer[] {3, 5, 4, 2, 0, 1});
        Integer[] array = bubleSort.sort();
        
        assertArrayEquals(new Integer[] {0, 1, 2, 3, 4, 5}, array);
    }
    
    @Test
    public void testSort4() {
        BubleSort<Integer> bubleSort = new BubleSort<Integer>(
                SortUtilities.generateNumbers(1000));
        Integer[] result = bubleSort.sort();
        
        assertTrue(SortUtilities.isSortedArray(result));
    }

    @Test
    public void testSort5() {
        BubleSort<Integer> bubleSort = new BubleSort<Integer>(
                SortUtilities.generateNumbers(10000));
        Integer[] result = bubleSort.sort();
        
        assertTrue(SortUtilities.isSortedArray(result));
    }
    
}
