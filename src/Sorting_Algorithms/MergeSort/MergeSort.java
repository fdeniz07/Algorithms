package Sorting_Algorithms.MergeSort;

public class MergeSort {

    // yardimci method
    public static void merge(int arr[], int left, int middle, int right){

        int low = middle -left+1 ; // size of the left subarray
        int high = right -middle; // size of the right subarray

        int L[] = new int[low];
        int R[] = new int[high];

        int i=0,j=0 ;

        for(i=0; i<low; i++){ // copy elements into left sub-array
            L[i] = arr[left+i];
        }

        for(j=0;j<high;j++){ // copy elements into right sub-array
            R[j]=arr[middle+1+j];
        }

        int k = left; // get starting index for  sort
        i=0;
        j=0; // reset loop variables

        while(i<low && j<high) { // merge the left and right subarray

            if(L[i]<=R[j]){
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i<low){ // merge the remaining elements from left subarray

            arr[k] = L[i];
            i++;
            k++;

        }

        while(j<high){  // merge the remaining elements from right subarray

            arr[k] = R[j];
            j++;
            k++;

        }

    }

    //ana method
    public static void mergeSort(int arr[], int left, int right) {

        int middle ;

        if(left < right) {
            middle = ( left + right) /2;
            mergeSort(arr,left,middle); // left subarray
            mergeSort(arr, middle+1,right); // right subarray

            merge(arr, left, middle,right); // merge the two subarrays
        }

    }



}
