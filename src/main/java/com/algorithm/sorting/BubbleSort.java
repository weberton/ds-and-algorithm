package com.algorithm.sorting;

import java.util.Arrays;

/**
 * Bubble sort algorithm.
 * Complexity:
 * Best: O(n) time | O(1) space
 * Average: O(n^2) time | O(1) space
 * Worst: O(n^2) time | O(1) space
 */
public class BubbleSort {

    public static void sort(int[] array) {
        boolean swap = true;

        while (swap) {
            swap = false;
            for (int i = 1; i < array.length; i++) {
                int previous = array[i - 1];
                int current = array[i];
                if (previous > current) {
                    swap(array, i, i - 1);
                    swap = true;
                }
            }
        }
    }

    private static void swap(int[] array, int current, int previous) {
        int aux = array[current];
        array[current] = array[previous];
        array[previous] = aux;
    }

    public static void main(String[] args) {
        int[] array = {10, 9, -8, 7, 6, 5, -4, 3, 2, 1, 0};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
