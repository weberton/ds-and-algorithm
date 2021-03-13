package com.algorithm.sorting;

public class QuickSort {

    public static void sort(int[] array) {
        quicksort(array, 0, array.length -1);
    }

    private static void quicksort(int[] array, int start, int end) {
        if(start < end){
            int pIndex = partition(array, start, end);
            quicksort(array, start, pIndex - 1);
            quicksort(array, pIndex + 1, end);
        }
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int pIndex = start;
        for(int i= start; i <= end -1; i ++){
            if(array[i] <= pivot){
                swap(array, i, pIndex);
                pIndex++;
            }
        }
        swap(array, pIndex, end);
        return pIndex;
    }

    private static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
