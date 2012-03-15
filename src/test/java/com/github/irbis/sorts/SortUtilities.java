package com.github.irbis.sorts;

import java.util.Random;

/**
 *
 * @author A.Nadtochey<irbis@github.com>
 */
public class SortUtilities {

    private SortUtilities() {
    }
    
    static Integer[] generateNumbers(int count) {
        Random random = new Random();
        Integer[] numbers = new Integer[count];
        
        for (int i = 0; i < count; i++)
            numbers[i] = Math.abs(random.nextInt());
        
        return numbers;
    }
    
    static boolean isSortedArray(Integer[] arrayToCheck) {
        boolean sorted = true;
        int i = 0;
        
        while (sorted && i < arrayToCheck.length - 2)
            sorted = arrayToCheck[i] < arrayToCheck[++i];
        
        return sorted;
    }
}
