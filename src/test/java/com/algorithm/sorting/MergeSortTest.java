package com.algorithm.sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MergeSortTest {

    @Test
    public void mergeSort_whenInputIsAlwaysDividableByTwo() {
        int[] list = new int[]{ 12, 11, 13, 5, 6, 7, 30, 20 };
        MergeSort.sort(list);
        System.out.println(Arrays.toString(list));

        Assert.assertArrayEquals(new int[]{5,6,7,11,12,13,20,30}, list);
    }

    @Test
    public void mergeSort_whenInputIsOdd() {
        int[] list = new int[]{ 12, 11, 13, 5, 6, 7, 30 };
        MergeSort.sort(list);
        System.out.println(Arrays.toString(list));

        Assert.assertArrayEquals(new int[]{5,6,7,11,12,13,30}, list);
    }

    @Test
    public void mergeSort_whenInputIsEven() {
        int[] list = new int[]{ 12, 11, 13, 5, 6, 7 };
        MergeSort.sort(list);
        System.out.println(Arrays.toString(list));

        Assert.assertArrayEquals(new int[]{5,6,7,11,12,13}, list);
    }

}