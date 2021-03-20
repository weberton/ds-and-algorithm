package com.algorithm.sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class HeapSortTest {

    @Test
    public void sort_usingMaxHeap() {
        int[] arr = new int[]{10, 15, 20, 17, 8};
        HeapSort.sortMax(arr);
        System.out.println(Arrays.toString(arr));
        Assert.assertArrayEquals("Arrays should be equals", new int[]{8, 10, 15, 17, 20}, arr);
    }

    @Test
    public void sort_usingMinHeap() {
        int[] arr = new int[]{10, 15, 20, 17, 8};
        HeapSort.sortMin(arr);
        System.out.println(Arrays.toString(arr));
        Assert.assertArrayEquals("Arrays should be equals", new int[]{20, 17, 15, 10, 8}, arr);
    }

    @Test
    public void sort_usingMaxHeap_2() {
        int[] arr = new int[]{2, 4, 8, 9, 7, 10, 9, 15, 20, 13};
        HeapSort.sortMax(arr);
        System.out.println(Arrays.toString(arr));
        Assert.assertArrayEquals("Arrays should be equals", new int[]{2, 4, 7, 8, 9, 9, 10, 13, 15, 20}, arr);
    }

}