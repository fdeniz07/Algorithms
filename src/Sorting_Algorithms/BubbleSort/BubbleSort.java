package Sorting_Algorithms.BubbleSort;

public class BubbleSort {

    public static void bubbleSort(int arr[]) {

        //swap var mi yok mu? Varsa diger iterasyona gececegiz
        boolean swapped = false;

        do {
            swapped = false;
            for (int i = 1; i < arr.length; i++) {
                //2 sayiyi karsilastiriyoruz, soldaki eleman sagdaki elemandan büyükse swap yap

                if (arr[i - 1] > arr[i]) {

                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    swapped = true;

                }
            }
        } while (swapped);
    }
}
