package com.algorithm.sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class QuickSortTest {

    @Test
    public void quickSortTest() {
        int[] array = {9, 6, 7, 4, 8, 1, 6, 3};
        int[] expectedResult = {1, 3, 4, 6, 6, 7, 8, 9};

        QuickSort.quickSort(array);

        Assert.assertArrayEquals(expectedResult, array);

    }

    @Test
    public void quickSortSortWithRandom() {
        for (int i = 0; i < 5; i++){
            int [] array = generateArray(1000);
            int [] expectedResult = Arrays.copyOfRange(array, 0, array.length);
            Arrays.sort(expectedResult);

            QuickSort.quickSort(array);

           Assert.assertArrayEquals(expectedResult, array);
        }
    }

    public static int[] generateArray(int n){
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = ThreadLocalRandom.current().nextInt(1, 1000);
        }

        return a;
    }
}
