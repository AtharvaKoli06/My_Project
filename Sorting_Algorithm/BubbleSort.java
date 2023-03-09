package Sorting_Algorithm;
import java.util.*;
//import java.util.AbstractList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;

public class BubbleSort {
    public void bubbleSort (int[] arr) {
        int n = arr.length;
        //n-1 iterations/passes
        for (int i = 0; i < n-1; i++) {
            boolean flag  = false; // has any swap happen
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true; //some swap has happen
                }
            }
            if (!flag) { //have any swap is happen
                return;
            }
        }
    }
    public int twoSum (int[] arr,int target) {
        int x = 0,y = arr.length-1,currSum = 0;
        while (x < y) {
           if(arr[x] + arr[y] == target) {
               return target;
           }
//           if(currSum > target) {
//               x = x - 1;
//           }
//           if (currSum < target) {
//               y = y + 1;
//           }
           x++;
           y--;
       }
        return -1;
    }
//    https://leetcode.com/tag/sorting/
//    https://leetcode.com/tag/Array/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1, 13, 14, 5, 7, 111};
        int target = sc.nextInt();
        BubbleSort obj = new BubbleSort();
//        obj.bubbleSort(a);

        System.out.println(obj.twoSum(a,target));
        for (int i :a) {
            System.out.print(i + " ");
        }
    }
}
