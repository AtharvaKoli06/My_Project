package Arrayss;

import java.util.Scanner;

public class First_Array {
    public static int lastOccurrance(int a[],int x) {
       int index = -1;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == x){
                index = i;
            }
        }
        return index;
    }
    public static int countOfElement(int a[], int x) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == x) {
                count++;
            }
        }
        return count;
    }
    public static int countOfGreatestElement(int a[], int x) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] > x) {
                count++;
            }
        }
        return count;
    }
    public static boolean sortedArray(int a[]) {
        boolean ans = true;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i-1]) {
                ans = false;
            }
        }
        return ans;
    }
    static int findSumOfArray(int[] arr) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        return totalSum;
    }
    static boolean equalsSumPartition(int[] arr) {
        int totalSum = findSumOfArray(arr);

        int prefSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefSum += arr[i];
            int suffixSum = totalSum - prefSum;
            if(suffixSum == prefSum) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//
//        System.out.println("\nThe array length is: " + arr.length);
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("\nElement are: ");
//        for (int i = 0; i < n; i++) {
//            System.out.println(arr[i]);
//        }

//        int a[] = { 1, 4, 7, 9 };
//        int n = a.length;
//        int b[] = new int[n];
//        b = a;//Referenced array
//        b[0] = 5;
//
//        System.out.println("Original array ");
//        for (int i = 0; i < n; i++)
//            System.out.print(a[i] + " ");
//        System.out.println("\nReferenced Array ");
//        for (int i = 0; i < n; i++)
//            System.out.print(b[i] + " ");

//        int a[] = { 1, 4, 7, 9 };
//        int n = a.length;
//        int b[] = a.clone();
//        b[0] = 5;
//
//        System.out.println("Original array ");
//        for (int i = 0; i < n; i++)
//            System.out.print(a[i] + " ");
//        System.out.println("\nCloned Array ");
//        for (int i = 0; i < b.length; i++)
//            System.out.print(b[i] + " ");
//    }
//        int a[] = {1, 4, 7, 9};
//        int n = a.length;
//        int b[] = Arrays.copyOf(a, 4);
//        b[0] = 5;
//
//        System.out.println("Original array ");
//        for (int i = 0; i < n; i++)
//            System.out.print(a[i] + " ");
//        System.out.println("\nCopied Array ");
//        for (int i = 0; i < b.length; i++)
//            System.out.print(b[i] + " ");
*/
//        Last Occurance
//         int a[] = {1, 4, 7, 9, 1};
//        System.out.println(lastOccurrance(a, 4));

//        Count Of Element
//       int a[] = {1, 4, 7, 9, 1};
//        System.out.println(countOfElement(a, 1));

//        Count Of Greatest Element
//           int a[] = {1, 4, 7, 9,1};
//        System.out.println(countOfGreatestElement(a, 5));

        //Is Array Sorted or not
//        int a[] = {1, 2, 3, 4, 5, 6, 7};
//        System.out.println(sortedArray(a));


//        System.out.println("The First Repeating number is: " + firstRepeatingNumber(a));

//        Swaping(5, 10);

//        int a[]={1,2,3,4,5};
//
//        System.out.println("Original array ");
//        for(int i=0;i<a.length;i++){
//            System.out.print(a[i]+" ");
//        }
//        System.out.println("");
//        int n = a.length;
//        reverse(a,n);
//        System.out.println("Reversed array ");
//        for(int i=0;i<a.length;i++){
//            System.out.print(a[i]+" ");
//        }





    }
}
