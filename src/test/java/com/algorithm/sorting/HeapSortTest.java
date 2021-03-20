package com.algorithm.sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class HeapSortTest {

    @Test
    public void heapSort() {
        int[] array = new int[]{9,8,7,6,5,4,3,2,1};
        HeapSort.sort(array);

        System.out.println(Arrays.toString(array));
        Assert.assertArrayEquals("Array sort should be {1,2,3,4,5,6,7,8,9}", new int[]{1,2,3,4,5,6,7,8,9} , array);
    }

    @Test
    public void heapSort_mixed() {
        int[] array = new int[]{9,8,7,4,5,6,3,2,1};
        HeapSort.sort(array);

        System.out.println(Arrays.toString(array));
        Assert.assertArrayEquals("Array sort should be {1,2,3,4,5,6,7,8,9}", new int[]{1,2,3,4,5,6,7,8,9} ,array);
    }
}
