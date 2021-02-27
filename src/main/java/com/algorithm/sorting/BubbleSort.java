package com.algorithm.sorting;

public class BubbleSort {
    public static void main(String[] args) {

        sort(new int[]{2,1,4,3,8,7,9,5,6});
    }

    public static void sort(int[] arr){
        for (int i=0; i < arr.length; i++){
            for (int y=0; y < (arr.length - i) - 1; y++){
                if (arr[y] > arr[y+1]){
                    int aux = arr[y];
                    arr[y] = arr[y+1];
                    arr[y+1] = aux;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
