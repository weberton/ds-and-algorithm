package com.algorithm.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int smallerIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallerIndex]) {
                    smallerIndex = j;
                }
            }

            swap(array, smallerIndex, i);
        }
    }

    private static void swap(int[] array, int smallerIndex, int i) {
        int aux = array[smallerIndex];
        array[smallerIndex] = array[i];
        array[i] = aux;
    }

    public static void main(String[] args) {
        int[] array = {10, 9, -8, 7, 6, 5, -4, 3, 2, 1, 0};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
