package com.algorithm.sorting;

public class HeapSort {

    public static void sort(int[] array) {
        buildMaxHeap(array);
        int heapSize = array.length;

        while (heapSize > 0) {
            swap(array, 0, heapSize - 1);
            heapSize--;
            siftDown(array, 0, heapSize);
        }
    }

    private static void buildMaxHeap(int[] array) {
        int parentIndex = (array.length - 2) / 2;

        while (parentIndex >= 0) {
            siftDown(array, parentIndex, array.length);
            parentIndex--;
        }
    }

    private static void siftDown(int[] array, int parentIndex, int heapSize) {
        int leftChildIndex = getLeftChildIndex(heapSize, parentIndex);
        int rightChildIndex = getRightChildIndex(heapSize, parentIndex);
        int greatestChildIndex = -1;

        if (leftChildIndex > 0 && rightChildIndex > 0) {
            if (array[leftChildIndex] >= array[rightChildIndex]) {
                greatestChildIndex = leftChildIndex;
            } else {
                greatestChildIndex = rightChildIndex;
            }


        } else if (leftChildIndex > 0) {
            greatestChildIndex = leftChildIndex;
        } else if (rightChildIndex > 0) {
            greatestChildIndex = rightChildIndex;
        }

        if (greatestChildIndex > 0 && array[greatestChildIndex] > array[parentIndex]) {
            swap(array, parentIndex, greatestChildIndex);
            siftDown(array, greatestChildIndex, heapSize);
        }
    }

    private static void swap(int[] array, int parentIndex, int greatestChildIndex) {
        int aux = array[parentIndex];
        array[parentIndex] = array[greatestChildIndex];
        array[greatestChildIndex] = aux;
    }

    private static int getLeftChildIndex(int heapSize, int parentIndex) {
        int index = parentIndex * 2 + 1;

        return index < heapSize ? index : -1;
    }

    private static int getRightChildIndex(int heapSize, int parentIndex) {
        int index = parentIndex * 2 + 2;

        return index < heapSize ? index : -1;
    }
}
