package main;

import java.util.Arrays;

/**
 * Bubble Sort is a simple sorting algorithm in Java that repeatedly steps through the list, compares adjacent elements,
 * and swaps them if they are in the wrong order.
 * This process continues until the entire list is sorted
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] unSortData = {60, 10, 50, 20, 30, 40, 70, 10};
        doBubbleSort(unSortData);
        System.out.println("SortData: " + Arrays.toString(unSortData));
    }

    private static void doBubbleSort(int[] unSortData) {

        int n = unSortData.length;

        // Outer loop for passes
        for(int i = 0; i < n - 1; i++) {

            // Inner loop for comparisons and swaps
            boolean isSwap = false;
            for(int j = 0; j < (n - i) - 1; j++) {

                // Compare adjacent elements
                if(unSortData[j] > unSortData[j + 1]) {

                    // Swap if they are in the wrong order
                    isSwap = true;
                    int temp = unSortData[j];
                    unSortData[j] = unSortData[j + 1];
                    unSortData[j + 1] = temp;
                }
            }

            if(!isSwap) break;
        }
    }
}
