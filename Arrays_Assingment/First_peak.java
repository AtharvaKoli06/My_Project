package Arrays_Assingment;

import java.util.Arrays;
import java.util.Scanner;

public class First_peak {
    public static int first_peak(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[i+1]) {
                return arr[i];
            }
        }
        return arr[arr.length-1];
    }
        public static int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[] {i, j};
                    }
                }
            }
            return new int[] {};
        }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 9, 3, 8, 2, 6, 5, 7, 0};
//        System.out.println(first_peak(arr));
        System.out.println("Enter target to make sum :(");
        int target = sc.nextInt();

        System.out.println(Arrays.toString(twoSum(arr, target)));


    }
}
