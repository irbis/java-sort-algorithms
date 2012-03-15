package com.github.irbis.sorts;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Merge sort. Hasn't finished yet.
 * 
 * @author A.Nadtochey<irbis@github.com>
 */
public class MergeSort<T extends Comparable> extends Sort<T> {

    public MergeSort(T[] elements) {
        super(elements);
    }

    @Override
    public T[] sort() {
        if (elements.length != 0) 
            return sortArray();
        else 
            return elements;
    }

    private T[] sortArray() {
        // TODO omit Arrays.copyOfRange (requires additional memory).
        // TODO size of array to sort by Arrays.sort().
        
        int middleIndex = elements.length / 2;

        T[] sArr1 = Arrays.copyOfRange(elements, 0, middleIndex);
        T[] sArr2 = Arrays.copyOfRange(elements, middleIndex, elements.length);

        Arrays.sort(sArr1);
        Arrays.sort(sArr2);

        return merge(sArr1, sArr2);
    }
    
    private T[] merge(T[] arr1, T[] arr2) {
        T[] mergedArr;
        int mergedArrIndex = 0;
        int arr1Index = 0;
        int arr2Index = 0;

        if (arr1.length > 0)
            mergedArr = (T[]) Array.newInstance(arr1[0].getClass(), 
                arr1.length + arr2.length);
        else 
            mergedArr = (T[]) Array.newInstance(arr2[0].getClass(), 
                arr1.length + arr2.length);            
        
        while (arr1Index < arr1.length && arr2Index < arr2.length) {
            if (arr1[arr1Index] == arr2[arr2Index]) {
                mergedArr[mergedArrIndex++] = arr1[arr1Index++];
                mergedArr[mergedArrIndex++] = arr2[arr2Index++];
            } else if (arr1[arr1Index].compareTo(arr2[arr2Index]) < 0) {
                mergedArr[mergedArrIndex++] = arr1[arr1Index++];
            } else {
                mergedArr[mergedArrIndex++] = arr2[arr2Index++];
            }
        }
        
        while (arr1Index < arr1.length)
            mergedArr[mergedArrIndex++] = arr1[arr1Index++];

        while (arr2Index < arr2.length)
            mergedArr[mergedArrIndex++] = arr1[arr2Index++];
        
        return mergedArr;
    }
}
