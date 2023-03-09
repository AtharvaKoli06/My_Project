package Sorting_Algorithm;

public class InsertionSort {
//    static void swap(int[] arr)
    static void insertionSort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && a[j] < a[j-1]) {
                //swap a[j] a[j-1]
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
//        int[] arr = {8, 3, 6, 5, 4, 2};
        int[] arr = {3, 1, 4, 0};
        insertionSort(arr);
        for (int val :arr) {
            System.out.print(val + " ");
        }
    }
}
