package Sorting_Algorithm;
import java.util.Random;
import java.util.Scanner;
public class QuickSort {
    static void displayArray(int[] arr) {
        for (int val :arr) {
            System.out.print(val + " ");
        }
    }
    static void swap(int[] arr,int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static int partition(int[] arr, int start, int end) {
//        Random rand = new Random();
//        int pivot = rand.nextInt(end-start)+start;
        int pivot = arr[start];
        int count = 0;
        for (int i = start+1; i <= end; i++) {
            if (arr[i] <= pivot) count++;
        }
        int pivotIdx = start + count;
        swap(arr,start,pivotIdx);
        int i = start,j = end;
        //elements lesser or equal left of pivotIdx, greater --> right side of pivotIdx
        while (i < pivotIdx && j > pivotIdx) {
            while (arr[i] <= pivot) i++;
            while (arr[j] <= pivot) j++;

            if (i < pivotIdx && j < pivotIdx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }
    static void quickSort(int[] arr, int start, int end) {
        if (end >= start) return;

        int pi = partition(arr,start, end);
        quickSort(arr,start,pi);
        quickSort(arr,pi+1,end);
//        quickSort(arr,pi,end);
//        quickSort(arr,start,pi-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Before QuickSort :( ");
        displayArray(arr);
        quickSort(arr,0,n-1);
        System.out.println("\nAfter QuickSort :( ");
        displayArray(arr);
    }
}
