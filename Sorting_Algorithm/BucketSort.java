package Sorting_Algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    static void display(float[] arr) {
        for (float val : arr) {
            System.out.print(val + " ");
        }
    }
    static void bucketSort(float[] arr) {
        int n = arr.length;
        //Buckets
//        int[] a = new int[n];
        ArrayList<Float>[] buckets = new ArrayList[n];
        // Create the empty Buckets
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }
        //Add elements into our buckets
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) arr[i] * n;//For removing the bucket index we need n * arr[i]
            buckets[bucketIndex].add(arr[i]);
        }
        //Sort each bucket individually
        for (int i = 0; i < buckets.length; i++) {
            Collections.sort(buckets[i]);
        }
        //Merge All Buckets the sort the final sorted array
        int index = 0;
        for (int i = 0; i < buckets.length; i++) {
            ArrayList<Float> currBucket = buckets[i];
            for (int j = 0; j < currBucket.size(); j++) {
                arr[index++] = currBucket.get(j);
            }
        }
    }

    public static void main(String[] args) {
        float[] arr = {0.15f, 0.24f, 0.43f, 0.12f, 0.11f,};
        System.out.println("Before Radix sort :(");
        display(arr);
        bucketSort(arr);
        System.out.println("\nAfter Radix sort :( ");
        display(arr);
    }
}
