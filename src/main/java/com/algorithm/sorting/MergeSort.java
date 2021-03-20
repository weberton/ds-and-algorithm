package com.algorithm.sorting;

public class MergeSort {

    public static void sort(int[] array){
        mergesort(array, array.length);
    }

    private static void mergesort(int[] list, int n){
        //break condition
        if(n < 2){
            return;
        }
        int mid = n/2;

        int[] left = new int[mid];
        for(int i = 0; i< mid; i++){
            left[i] = list[i];
        }

        int[] right = new int[n-mid];
        for(int i=mid; i< n; i++){
            //i - mid return to zero at the first interaction.
            right[i-mid] = list[i];
        }
        mergesort(left, mid);
        mergesort(right,n - mid);
        merge(list, left, right, mid, n-mid);
    }

    private static void merge(int[] list, int left[], int right[], int elementsLeft, int elementsRight) {
        int i = 0, j = 0, k = 0;
        while (i < elementsLeft && j < elementsRight){
            if(left[i] <= right[j]) {
                list[k++] = left[i++];
            } else{
                list[k++] = right[j++];
            }
        }

        while (i < elementsLeft){
            list[k++] = left[i++];
        }
        while(j < elementsRight){
            list[k++] = right[j++];
        }
    }
}
