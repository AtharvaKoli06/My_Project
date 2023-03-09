package Sorting_Algorithm;

public class RadixSort {
    static int findMax(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }
    static void countRadixSort(int[] arr, int place) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10]; //Frequency Array
        for (int i = 0; i < arr.length; i++) { //making frequency array
            count[(arr[i]/place)%10]++;
        }
//        Make prefix sum array of count array
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i-1];
        }

        //Find the index of each element int the original array and put it in output array
        for (int i = n-1; i >= 0; i--) {
            int idx = count[(arr[i]/place)%10] - 1;
            output[idx] = arr[i];
            count[(arr[i]/place)%10]--;
        }

        //copy All element of output array to arr
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
    static void radixSort(int[] arr) {
        int max = findMax(arr);
        //apply counting sort to sort the element based on place value
        for (int place = 1; max/place > 0; place *= 10) {
            countRadixSort(arr,place);
        }
    }
    static void display(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
      int[] arr = {175, 1762, 45, 75, 9, 802, 2, 9678};
      System.out.println("Before Radix sort :(");
       display(arr);
       radixSort(arr);
       System.out.println("\nAfter Radix sort :( ");
        display(arr);
    }
}
