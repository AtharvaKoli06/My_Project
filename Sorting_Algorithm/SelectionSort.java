package Sorting_Algorithm;

public class SelectionSort {

    static void selectionSort (int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) { //this i represents the current index
            //Find the minimum element in unsorted part of the array
            int min_index = i;
            for (int j = i+1;j < n;j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            //swap the current element and minimum element --> current index i will correct element
            // arr[min_index],arr[i]
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
//            arr[i] = arr[i] - arr[min_index];
//            arr[min_index] = arr[i] - arr[min_index];
//            arr[i] = arr[i]  + arr[min_index];
        }
    }

    

    public static void main(String[] args) {
        int[] arr = {4, 42, 43, 44, 45};
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
