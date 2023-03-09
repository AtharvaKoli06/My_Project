package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class recur_Array_6 {
    static void printArrayElements (int[] arr, int idx) {
        //Base case
        if(idx == arr.length) return;
        //self work
        System.out.println(arr[idx]); //5
        // sub problem --> recursive work
        printArrayElements(arr, idx + 1); //from 2nd idx 6, 7, 8

    }
    static int mxInArray(int[] arr, int idx) {
//         Base Case
        if (idx == arr.length-1) return arr[idx];
        // recursive Case --> idx+1, end of the array --> max --> small problem
        int smallAns = mxInArray(arr, idx+1);
        //self work and final ans
        return Math.max(arr[idx], smallAns);
    }
    static int findSecondLargest(int[] arr, int index, int largest,int secondLargest) {
        if(index == arr.length) {
            return secondLargest;
        }
        int element = arr[index];
        if(element > secondLargest) {
            if(element > largest) {
                return findSecondLargest(arr, index + 1, element, largest);
            } else {
                return findSecondLargest(arr, index + 1, largest, element);
            }
        }
        return findSecondLargest(arr, index + 1, largest, secondLargest);
    }
    static int sumOfArrayElement (int[] arr, int idx) {
        //base case
        if(idx == arr.length) return 0;
        //recursive case
       int smallAns = sumOfArrayElement(arr, idx+1);
//       self work
      return smallAns + arr[idx];
    }
    public static int NumberOfPaths(int m , int n , int i , int j){
        if(i >= m || j >= n)
            return 0;
        if(i == m - 1 && j == n - 1)
            return 1;
        return NumberOfPaths(m , n , i + 1 , j) + NumberOfPaths(m , n , i , j + 1);
    }
    public static void sumInTriangle (int[] arr) {
        //Base Case
        if (arr.length < 1) return;
        //recursive case
        // Creating new array which contains the sum of consecutive elements in the array passes as parameter.
        int[] temp = new int[arr.length - 1];
//        Traverse through the input array using a for loop
        for (int i = 0; i < arr.length - 1; i++) {
//            At each iteration adding a new element which is the sum of consecutive elements
            int x = arr[i] + arr[i + 1];
            temp[i] = x;
        }
        // Make a recursive call and pass the newly created array
        sumInTriangle(temp);
        // Print current array in the end so that smaller arrays are printed first
        System.out.println(Arrays.toString(arr));

    }
    public static void printCombination(int[] arr, int n, int r) {
        // A temporary array to store all combination one by one
        int[] data=new int[r];
        // Print all combination using temporary array 'data[]'
        combination(arr, n, r, 0, data, 0);
    }
    public static void combination(int[] arr, int n, int r, int index, int[] data, int i) {
        // Current combination is ready to be printed, print it
        if (index == r) {
            for (int j=0; j<r; j++)
                System.out.print(data[j]+" ");
            System.out.println("");
            return;
        }
        // When no more elements are there to put in data[]
        if (i >= n)
            return;
        // current is included, put next at next location
        data[index] = arr[i];
        combination(arr, n, r, index+1, data, i+1);
        // current is excluded, replace it with next (Note that i+1 is passed, but index is not changed)
        combination(arr, n, r, index, data, i+1);
    }
    public static void generate(int[] A, int[] B, int[] C, int i, int j, int m, int n, int len, boolean flag){
        if (flag) {
            // Include valid element from A
            // Print output if there is at least one 'B' in output array 'C'
            if (len != 0) {
                printArr(C, len + 1);
            }
            // Recur for all elements of A after current index
            for (int k = i; k < m; k++) {
                if (len == 0) {     //this block works for the very first call to include the first element in the output array
                    C[len] = A[k];
                    // don't increment len as B is included
                    generate(A, B, C, k + 1, j, m, n, len, !flag);
                }
                else if (A[k] > C[len]) { // include valid element from A and recur
                    C[len + 1] = A[k];
                    generate(A, B, C, k + 1, j, m, n, len + 1, !flag);
                }
            }
        }
        else {  //Include valid element from B and recur
            for (int l = j; l < n; l++) {
                if (B[l] > C[len]) {
                    C[len + 1] = B[l];
                    generate(A, B, C, i, l + 1, m, n, len + 1, !flag);
                }
            }
        }
    }
    public static void printArr(int[] arr, int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = {20, 10, 30, 40};
//        printArrayElements(arr, 0);

        //MAx in Array
//        System.out.println(mxInArray(arr,0));
//        System.out.println(findSecondLargest(arr,0,mx,0));

        //Sum of Array elements
//        System.out.println(sumOfArrayElement(arr, 0));


//        NumberOfPaths
        System.out.println("Enter the dimensions of the matrix: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int i = 0;
        int j = 0;
//        System.out.println(NumberOfPaths(m , n , i , j));

//        int mx = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            mx = Math.max(arr[i], mx);
////            min = arr[i];
//        }
//        System.out.println(mx);

//        System.out.println("Enter the length of array: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter the elements of array: ");
//        for(int i = 0; i < n; i++){
//            arr[i] = sc.nextInt();
//        }
////        sumInTriangle(arr);
        System.out.println("Enter r :( ");
        int r = sc.nextInt();
        printCombination(arr, n, r);

//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter the length of both the arrays: ");
//        int m = scn.nextInt();
//        int n = scn.nextInt();
//        int[] A = new int[m];
//        int[] B = new int[n];
//        System.out.println("Enter the elements of first array: ");
//        for(int i = 0; i < m; i++){
//            A[i] = scn.nextInt();
//        }
//        System.out.println("Enter the elements of second array: ");
//        for(int i = 0; i < n; i++){
//            B[i] = scn.nextInt();
//        }
//        int[] C = new int[m + n];
//        generate(A, B, C, 0, 0, m, n, 0, true);


    }
}

