package com.algorithm.sorting;

import java.util.Arrays;

public class BubbleSort {


    public static void main(String args []) {
        int [] myArray = new int [] { 7,5,3,2,1};
        int aux = 0;

        for (int j = 0; j < myArray.length; j++) {
            for (int i = 0; i < myArray.length -1; i++) {
                if (myArray[i] > myArray[i + 1]) {
                    aux = myArray[i];
                    myArray[i] = myArray[i + 1];
                    myArray[i + 1] = aux;
                }
            }
        }

        System.out.println(Arrays.toString(myArray));
    }

}
