package Sorting_Algorithm;

public class CountSort {
    static void display(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
    static int[] prefixSum(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }
    static int findMax(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }
    static void basicCountSort(int[] arr) {
        //Find the largest element of the array
        int mx = findMax(arr);
        int[] count = new int[mx+1]; //Frequency Array
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int k = 0; //This variable is to iterate the Frequency array
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[k++] = i;
            }
        }
    }
    static void countSort(int[] arr) {
        int n = arr.length;
        int[] output = new int[n];
        //Find the largest element of the array
        int mx = findMax(arr);
        int[] count = new int[mx+1]; //Frequency Array
        for (int i = 0; i < arr.length; i++) { //making frequency
            count[arr[i]]++;
        }
//        Make prefix sum array of count array
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i-1];
        }
        //Find the index of each element int the original array and put it in output array
        for (int i = n-1; i >= 0; i--) {
            int idx = count[arr[i]] - 1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }
        //copy All element of output array to arr
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
      int[] arr = {1, 4, 5, 2, 2, 5};
//        System.out.println("The Max is: " + findMax(arr));
        System.out.println("Before Count Sorting :( ");
        display(arr);
//        basicCountSort(arr);
        countSort(arr);
        System.out.println("\nAfter Count Sorting :( ");
        display(arr);



//        int[] pre = prefixSum(arr);
//        display(pre);



    }
}
