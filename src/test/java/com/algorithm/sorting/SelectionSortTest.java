package com.algorithm.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SelectionSortTest {

    @Test
    void shouldSortProperly() {
        int[] array = {10, 9, -8, 7, 6, 5, -4, 3, 2, 1, 0};
        int[] expected = {-8, -4, 0, 1, 2, 3, 5, 6, 7, 9, 10};

        BubbleSort.sort(array);

        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    void shouldReturnEmptyArray() {
        int[] array = {};

        BubbleSort.sort(array);

        Assertions.assertEquals(0, array.length);
    }
}
