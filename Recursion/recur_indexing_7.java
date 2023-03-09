package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class recur_indexing_7 {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static boolean linearSearchOnElement (int[] arr, int target, int idx) {
        //Base case
        if (idx == arr.length) return false;
//        self work
        if (arr[idx] == target) {
            return true;
        }
        //recursive case
        return linearSearchOnElement(arr, target, idx+1);
    }
    static int linearSearchOnIndex (int[] arr, int target, int idx) {
        //THis method will return index of element if target present in array, otherwise return -1
        //Base case
        if (idx == arr.length) return -1;
//        self work
        if (arr[idx] == target) {
            return idx;
        }
        //recursive case
        return linearSearchOnIndex(arr, target, idx+1);
    }
    static void findingAllIndices (int[] arr, int target, int idx) {
        //Base Case
        if(idx >= arr.length) return;
        //self Work
        if (arr[idx] == target) {
            System.out.println(idx);
        }
        //recursive work
        findingAllIndices(arr, target,idx+1);

    }
    static ArrayList<Integer> allIndices (int[] arr, int target, int idx) {
        //Base Case
        if (idx >= arr.length)
            return new ArrayList<Integer>(); //return empty array list

        ArrayList<Integer> ans = new ArrayList<>();

        //self work
        if (arr[idx] == target)
            ans.add(idx); //Adding index value of first element of an array
        //recursive work,
       ArrayList<Integer> smallAns =  allIndices(arr, target, idx + 1);
       ans.addAll(smallAns);
       return ans;
    }
    //implement the isSorted method that check the array sorted or not
    static boolean isSorted (int[] arr, int idx) {
        //Base case
        if (idx == arr.length-1) return true;
        //Recursive Call
       if(arr[idx] < arr[idx+1]) {
           return isSorted(arr, idx + 1);
       }
       else {
           return false;
       }
    }
    //Find last index of target in arr
    static int lastIndex (int[] arr, int idx, int last) {
        //Base case
        if(idx >= arr.length) return -1;
        //recursive work
       int lastIdx = lastIndex(arr, idx + 1, last);
       if (arr[idx] == last && idx > last)
           return idx;
       else
           return lastIdx;
    }
    static int lastIndex_ReverseTraverse_Recursion(int[] arr, int x,int i){
        i-=1; //pass i as arr.length
        if(i==-1)
            return -1;
        if(arr[i]==x)
            return i;
        return lastIndex_ReverseTraverse_Recursion(arr, x, i-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int[] a = {3, 8, 7, 5, 1, 9};
        int[] a = {1, 2, 3, 2, 2, 4, 5, 4, 5}; //finding the indices of this array
//        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Inputs array");
        printArray(a);
//        System.out.println("\nEnter the searching number :( ");
//        int target = sc.nextInt();

//        System.out.println(linearSearchOnElement(a, target,0));
//        if (linearSearchOnElement(a, target,0)) {
//            System.out.println("Yes");
//        }else {
//            System.out.println("No");
//        }
//        System.out.println("The searching number Found at index :(" + linearSearchOnIndex(a, target, 0) + "):");
//       int target = 1;
//        findingAllIndices(a, target, 0);

//        ArrayList<Integer> ans = allIndices(a,target,0);
//        for (Integer i : ans) {
//            System.out.println(i);
//        }

//        System.out.println("\n" + isSorted(a,0));


//        System.out.println(lastIndex(a,0,5));

        System.out.println(lastIndex_ReverseTraverse_Recursion(a,2,a.length-1));


    }
}
