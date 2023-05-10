package Sorting_Algorithms.InsertionSort;

import java.util.Arrays;

public class InsertionSortRunner {

    public static void main(String[] args) {

        int[] arr = {12, 9, 4, 99, 120, 1, 3, 10};

        System.out.println("InsertionSort oncesi array : ");
        System.out.println(Arrays.toString(arr));
        System.out.println("******************");

        System.out.println("InsertionSort Sonrasi Array :");
        InsertionSort.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
