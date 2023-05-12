package Sorting_Algorithms.MergeSort;

import java.util.Arrays;

public class MergeSortRunner {

    public static void main(String[] args) {

        int[] arr = {3, 51, 4, 17, 3, 2, 65, 41, 1};

        System.out.println("Merge sort öncesi Array : ");
        System.out.println(Arrays.toString(arr));
        System.out.println("*************************");

        System.out.println("Merge sort sonrasi Array : ");
        MergeSort.mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
}
