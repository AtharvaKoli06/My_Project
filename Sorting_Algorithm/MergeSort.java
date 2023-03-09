package Sorting_Algorithm;
import java.util.Scanner;
public class MergeSort {
    static void displayArray(int[] arr) {
        for (int val :arr) {
            System.out.print(val + " ");
        }
    }
    static void merge (int[] arr, int l,int mid,int r) {
        int n1 = mid-l+1;
        int n2 = r-mid;

        int[] left = new int[n1];
        int[] right = new int[n2];
        int i,j, k;
        for (i = 0;i < n1;i++) left[i] = arr[l+i];//filling left array
        for (j = 0;j < n2;j++) right[j] = arr[mid+1+j];//filling right array
        i = 0;
        j = 0;
        k = l;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];//Over righting the array
            }else {
                arr[k++] = right[j++];//Over righting the array
            }
        }
        //this line is for while traversing the index would be remain behind
        while (i < n1) arr[k++] = left[i++];
        while (j < n2) arr[k++] = right[j++];
    }
    static void mergeSort(int[] arr, int l, int r) {
        if(l >= r) {
            return;
        }
            int mid = (l + r) /2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr, l,mid, r);//self work
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

        System.out.println("Array before Merge sorting");
        displayArray(arr);
        mergeSort(arr, 0, n-1);
        System.out.println("\nArray After Merge sorting");
        displayArray(arr);

    }
}
