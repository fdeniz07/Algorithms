package Sorting_Algorithms.QuickSort;

public class QuickSort {

    // yardimci method
    public static int partition(int dizi[], int alt, int ust) {
        // dizinin son elamani pivot seciliyor
        int pivot = dizi[ust];
        int i = (alt - 1);

        // alt ve ust sinir arasindaki elemanlari pivot ile karsilastirip kucuk olanlari sola atiyorum
        for (int j = alt; j < ust; j++) {

            if (dizi[j] <= pivot) {
                i++;
                int temp = dizi[i];
                dizi[i] = dizi[j];
                dizi[j] = temp;
            }
        }
        // pivot elemanin dizideki dogru konumu icin :
        int temp = dizi[i + 1];
        dizi[i + 1] = dizi[ust];
        dizi[ust] = temp;

        return i + 1;
    }

    // ana method
    public static void quickSort(int dizi[], int alt, int ust) {

        if (alt < ust) {

            int pi = partition(dizi, alt, ust);
            quickSort(dizi, alt, pi - 1); // pivotun sol tarafi icin calisir
            quickSort(dizi, pi + 1, ust); // pivotun  sag tarafi icin calisir

        }
    }
}
