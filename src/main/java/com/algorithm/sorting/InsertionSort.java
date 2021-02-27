package com.algorithm.sorting;

import java.util.Arrays;

/**
 * Insertion sort algorithm.
 * Complexity:
 * Best: O(n) time | O(1) space
 * Average: O(n^2) time | O(1) space
 * Worst: O(n^2) time | O(1) space
 */
public class InsertionSort {

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int current = i;
            int next = i + 1;

            while (current >= 0 ) {
                if (array[next] < array[current]) {
                    swap(array, current, next);
                    current--;
                    next--;
                } else {
                    break;
                }
            }
        }
    }

    private static void swap(int[] array, int current, int next) {
        int aux = array[current];
        array[current] = array[next];
        array[next] = aux;
    }

    public static void main(String[] args) {
        int[] array = {10, 9, -8, 7, 6, 5, -4, 3, 2, 1, 0};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
