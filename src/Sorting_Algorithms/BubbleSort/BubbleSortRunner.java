package Sorting_Algorithms.BubbleSort;

import java.util.Arrays;

public class BubbleSortRunner {

    public static void main(String[] args) {

        int arr[] = {3,1,2,45,0,69,5,3};

        System.out.println("Bubble sort öncesi Array : ");
        System.out.println(Arrays.toString(arr));
        System.out.println("*************************");

        System.out.println("Bubble sort sonrasi Array : ");
        BubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
