package problem_solvingOn_Array;

import java.util.Scanner;
public class peak_element_Not_Smaller_than_neighbour {

    static int peakElement(int[] a, int n) {

        int low = 0, high = n-1;

        while(low<=high) {
            int mid = (low+high)/2;

            if(mid == 0 || a[mid] >= a[mid-1] && mid == n-1 || a[mid] >= a[mid+1]) {
                return mid;
            } else if (a[mid] <= a[mid+1]) {
                low = mid + 1;
            }else {
                high = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(peakElement(a,n));

    }
}