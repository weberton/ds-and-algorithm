package com.algorithm.sorting;

public class QuickSort {

    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }

        int pivot = partition(array, start, end);

        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }

    private static int partition(int[] array, int start, int end) {

        int pivot = array[end];
        int pIndex = start;

        for (int i = start; i < end; i++) {
            int currentItem = array[i];
            if (currentItem <= pivot) {
                swap(array, i, pIndex);
                pIndex++;
            }
        }

        swap(array, pIndex, end);
        return pIndex;
    }

    private static void swap(int[] array, int i, int pIndex) {
        int aux = array[i];
        array[i] = array[pIndex];
        array[pIndex] = aux;
    }
}
