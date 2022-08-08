package com.personal.sortings;

import java.util.Arrays;

public class QuickSort{
    public static void main(String[] args) {

        int[] arr = {6, 2, 45, 66, 3, 67, 8, 99, 11, 12, 23, 5, 0, 79, 9, 33, 76, 24, 4, 55};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * <a href="https://www.youtube.com/watch?v=Vtckgz38QHs">...</a>
     * @param arr
     * @param startIdx
     * @param endIdx
     */
    static void quickSort(int[] arr, int startIdx, int endIdx) {

        if (endIdx <= startIdx) {
            return;
        }
        int pivot = quickSortHelper(arr, startIdx, endIdx);

        quickSort(arr, startIdx, pivot - 1);
        quickSort(arr, pivot + 1, endIdx);
    }

    static int quickSortHelper(int[] arr, int startIdx, int endIdx) {
        int startingPoint = startIdx - 1;
        int temp;
        for (int i = startIdx; i <= endIdx; i++) {
            if (arr[i] < arr[endIdx] || i == endIdx) {
                startingPoint++;
                temp = arr[startingPoint];
                arr[startingPoint] = arr[i];
                arr[i] = temp;
            }
        }
        return startingPoint;
    }
}
