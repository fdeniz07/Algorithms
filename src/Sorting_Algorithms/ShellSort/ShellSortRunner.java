package Sorting_Algorithms.ShellSort;

import java.util.Arrays;

public class ShellSortRunner {

    public static void main(String[] args) {

        int[] arr = {3, 5, 4};

        System.out.println("SSort oncesi Array :");
        System.out.println(Arrays.toString(arr));
        System.out.println("*******************");

        System.out.println("SSort Sonrasi Array :");
        ShellSort.shellSort(arr);
        System.out.println(Arrays.toString(arr));


    }
}
