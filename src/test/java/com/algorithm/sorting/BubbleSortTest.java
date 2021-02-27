package com.algorithm.sorting;

import org.junit.Test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void bubbleSort() {
        int[] array = new int[]{5, 2, 4, 6, 1, 3};
        BubbleSort.bubbleSort(array);

        assertArrayEquals(String.format("Output should be [1,2,3,4,5,6]"), new int[]{1,2,3,4,5,6}, array);
    }

    @Test
    public void bubbleSortWithRandom() {
        for (int i = 0; i < 5; i++){
            int [] array = generateArray(10);
            BubbleSort.bubbleSort(array);
            System.out.println(Arrays.toString(array));
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