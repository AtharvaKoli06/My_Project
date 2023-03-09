package SearchingAlgorithm;

import java.util.Scanner;

public class BinarySearch {
    static boolean binarySearch (int[] arr,int target) {
        int n = arr.length;
        int start = 0,end = n - 1;

        while (start <= end) {
//            int mid = (start + end) / 2;//this line will be overflow by its original or default value
            int mid = start + (end -start) / 2;
            if (target == arr[mid]) {
                return true;
            }else if(target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
    static boolean recBinarySearch (int[] arr,int start, int end,int target) {
        //base case
//        if (start <= end) {
//            return false;
        if (start > end) {return false;}
//            int mid = (start + end) / 2;//this line will be overflow by its original or default  value
        int mid = start + (end -start) / 2;
            if (arr[mid] == target) {
                return true;
            }else if (target < arr[mid]) {
                return recBinarySearch(arr,start,mid - 1,target);
            }else {
                return recBinarySearch(arr,mid + 1,end,target);
            }
//        }
//    return false;
    }
    static int bsFirstOccurrence(int[] arr, int target){
       int n = arr.length;
       int start = 0, end = n - 1;
       int fo = -1;
       while (start <= end) {
           int mid = start + (end - start) / 2;
           if (target == arr[mid]) {
               fo = mid;
               end = mid - 1;
           } else if (target < arr[mid]) {
               end = mid - 1;
           }else {
               start = mid + 1;
           }
       }
       return fo;
    }
    static int bsLastOccurrence(int[] arr, int target){
        int n = arr.length;
        int start = 0, end = n - 1;
        int fo = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                start = mid + 1;//It mean all the element are lesser.So, we have to search at the right side
                fo = mid;//update fo to mid.
            } else if (target < arr[mid]) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return fo;
    }
    static int firstIndex (int[] arr,int n, int target) {
        if (n < 1) {
            return -1;
        } else if (arr[0] == target) {
            return 0;
        }else {
            int i = firstIndex(arr, n - 1, target);
            return i == -1 ? i : i + 1;
        }
    }
    static int bsSquareRoot(int x) {
       int st = 0,end = x;
       int ans = -1;

       while (st <= end) {
           int mid = st + (end - st) / 2;
           int val = mid * mid; //use long here to avoid stack Overflow
           if (val == x){
               return x;
           } else if (val < x) {
               ans = mid;
               st = mid + 1; // g0 to the bigger number we will find the number
           }else {
               end = mid - 1;// g0 to the smaller number we will find the number
           }
       }
       return ans;
    }
    public static float findSqrtWithPrecision(int num, int precision) {
        int st = 0, end = num;
        double ans = -1.0;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            double val = mid * mid;
            if (val == num) {
                return mid;
            } else if (val < num) {
                st = mid + 1;
                ans = mid;
            } else {
                end = end - 1;
            }
        }
        double increment = 0.1;
        for (int i = 0; i < precision; i++) {
            while (ans * ans <= num) {
                ans += increment;
            }
            ans = ans - increment;
            increment = increment / 10;
        }
        return (float) ans;
    }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int[] arr = {2,4,5,6,7,15,20,24,45,50,77};
//        int target = 0,n = arr.length;
//        while (target != 20) {
//            System.out.printf("%d exists in iterative arr: %b \n", target , binarySearch(arr, target));
//            System.out.printf("%d exists in Rec arr: %b \n", target , recBinarySearch(arr, 0,n - 1,target));
//            System.out.println()
//            ;target++;
//        }
        int[] arr = {5,5,5,5,6,3,4,6,4,4,4};
        int target = 4;
//        System.out.println(bsFirstOccurrence(arr, target));
//        System.out.println(bsLastOccurrence(arr, target));
//        System.out.println(firstIndex(arr, arr.length-1,5));
//        int x = 25;
//        System.out.println(bsSquareRoot(x));

        //Square root with p precision
            int nums = 6;
            System.out.println(findSqrtWithPrecision(nums,5));
    }
}
