package Sorting_Algorithms.QuickSort;

import java.util.Arrays;

public class QuickSortRunner {

    public static void main(String[] args) {

        int[] arr = {3, 51, 4, 17, 3, 2, 65, 41, 1};

        System.out.println("Quick sort öncesi Array : ");
        System.out.println(Arrays.toString(arr));
        System.out.println("*************************");

        System.out.println("Quick sort sonrasi Array : ");
        QuickSort.quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
}
